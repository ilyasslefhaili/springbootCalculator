package com.example.springbootcalculator.repository;
import com.example.springbootcalculator.entities.Exceptions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExceptionRepository extends JpaRepository<Exceptions,Long> {
}
