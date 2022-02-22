package com.example.violationdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.violationdemo.model.Violation;
import com.example.violationdemo.repository.ViolationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ViolationServiceImpl implements ViolationService {

    @Autowired
    private ViolationRepository violationRepository;

    @Override
    public Violation createViolation(Violation violation) {
        return this.violationRepository.save(violation);
    }

    @Override
    public Violation updateViolation(Violation violation) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Violation> getAllViolations() {
        return this.violationRepository.findAll();
    }

    @Override
    public Violation getViolationById(long violationId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteViolation(long Id) {
        // TODO Auto-generated method stub

    }

}
