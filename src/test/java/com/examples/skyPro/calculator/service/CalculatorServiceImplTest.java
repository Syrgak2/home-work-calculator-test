package com.examples.skyPro.calculator.service;

import com.examples.skyPro.calculator.exception.DivisionByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {

    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldCalculatePlusTest() {
//        given
        int num1 = 10; int num2 = 15;
        int expectedResult = num1 + num2;

//        When
        int actualResult = calculatorService.plus(num1, num2);

//        Then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void shouldCalculateMinusTest() {
//        given
        int num1 = 10; int num2 = 15;
        int expectedResult = num1 - num2;

//        When
        int actualResult = calculatorService.minus(num1, num2);

//        Then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void shouldCalculateMultiplyTest() {
//        given
        int num1 = 10; int num2 = 15;
        int expectedResult = num1 * num2;

//        When
        int actualResult = calculatorService.multiply(num1, num2);

//        Then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void shouldCalculateDivideTest() {
//        given
        int num1 = 10; int num2 = 15;
        double expectedResult = (double) num1 / num2;

//        When
        double actualResult = calculatorService.divide(num1, num2);

//        Then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void shouldThrowExceptionWhenDividedZero() {
        int num1 = 10;
        int num2 = 0;

        Assertions.assertThrows(
                DivisionByZeroException.class,
                () -> calculatorService.divide(num1, num2)
        );
    }
}
