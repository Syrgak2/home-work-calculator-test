package com.examples.skyPro.calculator.controller;

import com.examples.skyPro.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorServiceInterface;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorServiceInterface = calculatorService;
    }

    @RequestMapping("/calculator")
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }


    @RequestMapping("/plus")
    public String plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров отсуствует";
        }

        return num1 + " + " + num2 + " = " + calculatorServiceInterface.plus(num1, num2);
    }

    @RequestMapping("/minus")
    public String minus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров отсуствует";
        }

        return num1 + " - " + num2 + " = " + calculatorServiceInterface.minus(num1, num2);
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров отсуствует";
        }

        return num1 + " * " + num2 + " = " + calculatorServiceInterface.multiply(num1, num2);
    }

    @RequestMapping("/divide")
    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров отсуствует";
        }

        return num1 + " / " + num2 + " = " + calculatorServiceInterface.divide(num1, num2);
    }


}
