package com.example.springbootcalculator.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data
@AllArgsConstructor
@NoArgsConstructor
public class Exceptions {
    private String title;
    private String description;
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id;

    public Exceptions(String aClass, String message) {
        this.description = message;
        this.title = aClass;
    }
}
