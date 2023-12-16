package com.examples.skyPro.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParametrizedTest {

    private static Stream<Arguments> provideNumbersForCalculator() {
        return Stream.of(
                Arguments.of(10, 19),
                Arguments.of(2, 122),
                Arguments.of(10, -19),
                Arguments.of(-10, -19)
        );
    }

    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void shouldCalculatePlusTest(int num1, int num2) {
//        given
        int expectedResult = num1 + num2;

//        When
        int actualResult = calculatorService.plus(num1, num2);

//        Then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void shouldCalculateMinusTest(int num1, int num2) {
//        given
        int expectedResult = num1 - num2;

//        When
        int actualResult = calculatorService.minus(num1, num2);

//        Then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void shouldCalculateMultiplyTest(int num1, int num2) {
//        given
        int expectedResult = num1 * num2;

//        When
        int actualResult = calculatorService.multiply(num1, num2);

//        Then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void shouldCalculateDivideTest(int num1, int num2) {
//        given
        double expectedResult = (double)num1 / num2;

//        When
        double actualResult = calculatorService.divide(num1, num2);

//        Then
        Assertions.assertEquals(expectedResult, actualResult);

    }
}
