# ---- FASE 1: Build ----
# Usamos una imagen con Java 21 y Maven para compilar
FROM eclipse-temurin:25-jdk AS builder
WORKDIR /app

# Copiamos el descriptor de dependencias primero (caching eficiente)
COPY pom.xml .
COPY .mvn .mvn
COPY mvnw .
RUN chmod +x mvnw

# Descargamos dependencias (se cachean si pom.xml no cambia)
RUN ./mvnw dependency:go-offline

# Copiamos el código fuente y compilamos
COPY src ./src
RUN ./mvnw clean package -DskipTests

# ---- FASE 2: Runtime ----
# Imagen más pequeña solo para ejecutar (sin Maven ni código fuente)
FROM eclipse-temurin:25-jre
WORKDIR /app

# Copiamos solo el JAR de la fase anterior
COPY --from=builder /app/target/*.jar app.jar

# Railway inyecta PORT automáticamente, Spring escucha ahí
ENV PORT=8080
EXPOSE ${PORT}

# Comando para iniciar la app
ENTRYPOINT ["java", "-jar", "-Dserver.port=${PORT}", "app.jar"]