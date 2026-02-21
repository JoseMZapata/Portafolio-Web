package com.tuportafolio.portfolio.model;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Skill {
    private String name;
    private String category;
    private int level;
}
