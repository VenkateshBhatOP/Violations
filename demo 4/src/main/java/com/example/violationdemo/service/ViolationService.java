package com.example.violationdemo.service;

import java.util.List;

import com.example.violationdemo.model.Violation;

public interface ViolationService {

    Violation createViolation(Violation violation);

    Violation updateViolation(Violation violation);

    List<Violation> getAllViolations();

    Violation getViolationById(long violationId);

    void deleteViolation(long Id);

}