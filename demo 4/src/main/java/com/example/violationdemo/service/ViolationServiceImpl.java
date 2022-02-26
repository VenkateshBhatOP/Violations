package com.example.violationdemo.service;

import java.util.List;
import java.util.HashSet;

import javax.transaction.Transactional;

import com.example.violationdemo.exception.ResourceNotFoundException;
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

        if (violation == null) {
            // Raise Error here
            return null;
        }

        // File + _ + Line + _ + Desc
        HashSet<String> uniqueEntries = new HashSet<>();

        violationRepository.findAll().forEach(e -> {
            uniqueEntries.add(e.getFile() + "_" + e.getLineNumber() + "_" + e.getErrorDesc());
        });

        String newEntry = violation.getFile() + "_" + violation.getLineNumber() + "_" + violation.getErrorDesc();

        if (!uniqueEntries.contains(newEntry)) {
            this.violationRepository.save(violation);
        } else {
            // Throw error here
            throw new ResourceNotFoundException("Enter proper data");
        }

        return violation;
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
