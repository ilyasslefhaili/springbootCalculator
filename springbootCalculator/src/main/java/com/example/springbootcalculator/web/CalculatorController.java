package com.example.springbootcalculator.web;

import com.example.springbootcalculator.entities.Exceptions;
import com.example.springbootcalculator.entities.Operation;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.SimpleTimeZone;

@Controller
@AllArgsConstructor
public class CalculatorController {
    private ExceptionService exceptionService;
    private CalculatorService calculatorService;
    @GetMapping("/index")
    public  String getCalculator(Model model){
        model.addAttribute("data", new Data());
        return "calculator";
    }
    @PostMapping("/operation")
    public  String makeOperation(@ModelAttribute Data data, @RequestParam String operation, Model model){
        model.addAttribute("result", calculatorService.makeOperation(data, operation));
        return "result";
    }

    @GetMapping("/operations")
    public String getOperatios(Model model){
        List<Operation> operations = calculatorService.getOperations();
        model.addAttribute("operations", operations);
        return "operations";
    }
    @GetMapping("/error")
    public String getError(){
        return "error";
    }
    @GetMapping("/exceptions")
    public String getExceptions(Model model){
        List<Exceptions> exceptions = exceptionService.getException();
        model.addAttribute("exceptions", exceptions);
        return "exceptions";
    }
}
