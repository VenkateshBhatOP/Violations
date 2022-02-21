package com.example.violationdemo.repository;

import com.example.violationdemo.model.Violation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ViolationRepository extends JpaRepository<Violation, Long> {

}
