package com.example.demo.view;

public class View {
    public static String getOperator(String operatorName) {
        return switch (operatorName) {
            case "mult" -> "*";
            case "sum" -> "+";
            case "subtract" -> "-";
            case "div" -> "/";
            default -> "zzz";
        };
    }
}
