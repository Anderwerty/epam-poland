package com.shylin.bank.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public class CalculatorService {
    // +, -, *, /  and (/ 0)

    private final Map<Operation, DoubleBinaryOperator> operationToAction = new HashMap<>();

    {
        operationToAction.put(Operation.ADD, Double::sum);
        operationToAction.put(Operation.MINUS, (a, b) -> a - b);
        operationToAction.put(Operation.MULT, (a, b) -> a * b);
        operationToAction.put(Operation.DIV, CalculatorService::div);
    }

    public double calculate(double a, Operation operation, double b) {
        return operationToAction.get(operation).applyAsDouble(a, b);
    }

    private static double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor is zero");
        }
        return a / b;
    }
}
