package com.example.demo.controller;

import com.example.demo.service.Calculator;
import com.example.demo.view.View;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CalculatorImpl;

@RestController
public class CalculatorController {

    Calculator calculatorImpl = new CalculatorImpl();

    @GetMapping("/calc/{operator}/{operand1}/{operand2}")
    public String calculator(@PathVariable String operator, @PathVariable int operand1, @PathVariable int operand2) {

        int result = 0;
        switch (operator) {
            case "mult":
                result = calculatorImpl.multiply(operand1, operand2);
                break;
            case "sum":
                result = calculatorImpl.sum(operand1, operand2);
                break;
            case "subtract":
                result = calculatorImpl.subtract(operand1, operand2);
                break;
            case "div":
                result = calculatorImpl.division(operand1, operand2);
                break;
            default:
                return "zzz";
        }

        String operatorSymbol = View.getOperator(operator);

        return String.format("%d%s%s=%d", operand1, operatorSymbol, operand2, result);


    }

}
