package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

//DTO - Data Transfer Object
public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {
}
