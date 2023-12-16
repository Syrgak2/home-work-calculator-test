package com.examples.skyPro.calculator.service;

import com.examples.skyPro.calculator.exception.DivisionByZeroException;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public int minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public double divide(Integer num1, Integer num2) {

        if (num2 == 0) {
            throw new DivisionByZeroException("на ноль делить нельзя");
        }

        return (double) num1 / num2;
    }
}
