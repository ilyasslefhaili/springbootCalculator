package com.example.springbootcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringbootCalculatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootCalculatorApplication.class, args);
    }
}
