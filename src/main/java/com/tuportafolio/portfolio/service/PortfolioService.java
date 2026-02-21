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
                        "Angular, CSS, HTML, Typescript, Bootstrap",
                        "Herramienta en formato web desarrollada para poder generar oficios de pagos de refrendo y replaqueo, ademas de poder importar tablas entre archivos excel",
                        "https://github.com/JoseMZapata/GestExcel",
                        "https://gest-excel-dild.vercel.app/"
                )

        );
    }
    public List<Skill> getSkills(){
        return List.of(
                new Skill("Java",        "Backend",  4),
                new Skill("Spring Boot", "Backend",  3),
                new Skill("Docker",      "DevOps",   2),
                new Skill("HTML/CSS",    "Frontend", 4),
                new Skill("Git",         "DevOps",   4),
                new Skill("MySQL",       "Base Datos",3)

        );
    }
}
