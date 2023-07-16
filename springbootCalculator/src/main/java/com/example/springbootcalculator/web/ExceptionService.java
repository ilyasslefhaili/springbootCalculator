package com.example.springbootcalculator.web;

import com.example.springbootcalculator.entities.Exceptions;
import com.example.springbootcalculator.repository.ExceptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExceptionService {
    private ExceptionRepository exceptionRepository;
    List<Exceptions> getException(){
        return exceptionRepository.findAll();
    }
}
