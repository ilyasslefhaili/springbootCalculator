package com.example.springbootcalculator.web;
import com.example.springbootcalculator.entities.Exceptions;
import com.example.springbootcalculator.repository.ExceptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.view.RedirectView;

@ControllerAdvice
@Service
@AllArgsConstructor
public class ExceptionListener {
    private ExceptionRepository exceptionRepository;
    @ExceptionHandler
    public String handleException(Throwable event) {
        this.exceptionRepository.save(new Exceptions(event.getClass().toString(), event.getMessage()));
        return "redirect:/error";
    }
}