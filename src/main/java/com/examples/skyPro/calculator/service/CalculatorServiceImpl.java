package com.examples.skyPro.calculator.service;

import com.examples.skyPro.calculator.exception.NullParameterException;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String plus(Integer num1, Integer num2) {

        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        int sum = num1 - num2;
        return num1 + " - " + num2 + " = " + sum;
    }

    @Override
    public String multiply(Integer num1, Integer num2) {

        int sum = num1 * num2;
        return num1 + " * " + num2 + " = " + sum;
    }

    @Override
    public String divide(Integer num1, Integer num2) {

        if (num2 == 0) {
            throw new IllegalArgumentException("на ноль делит нельзя");
        }

        int sum = num1 / num2;
        return num1 + " / " + num2 + " = " + sum;
    }
}
