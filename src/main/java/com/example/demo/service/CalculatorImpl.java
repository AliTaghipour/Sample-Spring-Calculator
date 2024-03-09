package com.example.demo.service;

import java.util.HashSet;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements Calculator {

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }
}
