package com.example.accessingrelationaldatausingjdbcwithspring;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private long id;
    private String firstName, lastName;
}
