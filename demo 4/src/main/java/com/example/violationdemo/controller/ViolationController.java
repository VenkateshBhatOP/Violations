package com.example.violationdemo.controller;

import java.util.List;

import com.example.violationdemo.model.Violation;
import com.example.violationdemo.service.ViolationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViolationController {

    @Autowired
    private ViolationService violationService;

    @GetMapping("/violations")
    public ResponseEntity<List<Violation>> getAllViolations() {
        return ResponseEntity.ok().body(violationService.getAllViolations());
    }

    @PostMapping("/violations")
    public ResponseEntity<Violation> createViolation(@RequestBody Violation violation) {
        return ResponseEntity.ok().body(violationService.createViolation(violation));

    }
}
