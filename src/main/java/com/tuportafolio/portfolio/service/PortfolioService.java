package com.tuportafolio.portfolio.service;

import com.tuportafolio.portfolio.model.Project;
import com.tuportafolio.portfolio.model.Skill;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PortfolioService {
    public List<Project> getProjects(){
        return List.of(
                new Project(
                        "Rediseño Posta",
                        "Pagina web usada para concurso de de desarrollo web donde se rediseño una pagina ya existente de la empresa de noticias Posta",
                        "Angular, CSS, HTML, Typescript, Bootstrap",
                        "https://github.com/JoseMZapata/POSTA",
                        "https://posta-p68x.vercel.app/"
                ),
                new Project(
                        "Herramienta web Gestexcel",
                        "Herramienta en formato web desarrollada para poder generar oficios de pagos de refrendo y replaqueo, ademas de poder importar tablas entre archivos excel",
                        "Angular, CSS, HTML, Typescript, Bootstrap",
                        "https://github.com/JoseMZapata/GestExcel",
                        "https://gest-excel-dild.vercel.app/"
                ),
                new Project(
                        "i-Remember",
                        "Aplicación móvil desarrollada en Ionic con el objetivo de hacer listas para supermercado",
                        "Ionic, Angular, CSS, HTML, Typescript, Bootstrap",
                        "https://github.com/JoseMZapata/i-Remeber",
                        "https://i-remeber.vercel.app/home"
                ),
                new Project(
                        "Correos Click",
                        "Ecommerce desarrollada para la empresa Correos de México (SU DESARROLLO NO ES PUBLICO Y EL USO DE ESTA AÚN NO ESTA PERMITIDO)",
                        "NextJS, NestJS, React Native, Nodejs, EXPO, Javascript",
                        "https://github.com/carlosserrano260904/Correos-Mexico-Monorepo",
                        "N/A"
                ),
                new Project(
                        "Efirmas=Engine",
                        "Engine de Ruby on Rails desarrollado para al empresa CIMAV. Permite al usuario poder firmar acuerdos con firma electronica con validez legal, asi como poder asignar firmantes, mandar correos electronicos, reportar errores, etc.",
                        "Ruby, Rails, OpenSSL, SSH, XOAUTH",
                        "https://github.com/JoseMZapata/EngineRuby_E-Firmas/tree/efirmas_engine_main",
                        "N/A"
                )



        );
    }
    public List<Skill> getSkills(){
        return List.of(
                new Skill("Java",        "Backend",  4),
                new Skill("Spring Boot", "Backend",  3),
                new Skill("Javascript", "Backend",  3),
                new Skill("Python", "Backend",  3),
                new Skill("Ruby", "Backend",  3),
                new Skill("C#", "Backend",  3),
                new Skill("NodeJS", "Backend",  3),
                new Skill("Docker",      "DevOps",   2),
                new Skill("Git",         "DevOps",   4),
                new Skill("HTML/CSS",    "Frontend", 4),
                new Skill("NestJs",    "Frontend", 4),
                new Skill("Angular",    "Frontend", 4),
                new Skill("React native",    "Frontend", 4),
                new Skill("React",    "Frontend", 4),
                new Skill("Bootstrap",    "Frontend", 4),
                new Skill("Tailwind",    "Frontend", 4),
                new Skill("Ionic",    "Frontend", 4),
                new Skill("Rails",    "Frontend", 4),
                new Skill("Expo",    "Frontend", 4),
                new Skill("MySQL",       "Base Datos",3),
                new Skill("PostgreSQL",       "Base Datos",3)

        );
    }
}
