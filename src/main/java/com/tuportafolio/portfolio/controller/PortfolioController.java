package com.tuportafolio.portfolio.controller;

import com.tuportafolio.portfolio.service.PortfolioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PortfolioController {
    private final PortfolioService portfolioService;

    @GetMapping("/")
    public String index(Model model) {
        // "model" es el puente entre Java y el HTML
        model.addAttribute("projects", portfolioService.getProjects());
        model.addAttribute("skills",   portfolioService.getSkills());
        model.addAttribute("name",     "Jose Manuel Zapata Rangel");
        model.addAttribute("title",    "Software Enginner/Junior FullStack Developer");
        model.addAttribute("bio",      "Apasionado por crear soluciones con código limpio.");
        model.addAttribute("email",    "josemanuelzapaatarange@gmail.com");
        model.addAttribute("github",   "https://github.com/JoseMZapata");

        return "index";
    }
}
