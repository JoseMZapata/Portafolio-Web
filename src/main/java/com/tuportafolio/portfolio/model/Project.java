package com.tuportafolio.portfolio.model;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Project {
    private String title;
    private String description;
    private String technologies;
    private String githubUrl;
    private String liveUrl;
}
