package com.aandras.interview.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @GetMapping("/health")
    public String healthCheck() {
        return "works";
    }
}
