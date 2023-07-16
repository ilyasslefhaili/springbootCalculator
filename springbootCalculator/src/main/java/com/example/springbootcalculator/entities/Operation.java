package com.example.springbootcalculator.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity @Data
@AllArgsConstructor @NoArgsConstructor
public class Operation {
    private Integer num1;
    private Integer num2;
    private String operator;
    @Id     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Operation(Integer num1, Integer num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }
}
