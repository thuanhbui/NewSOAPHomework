package com.baeldung.springsoap;

public class CalculatorService {

    public float add(float number1, float number2) {
        return number1 + number2;
    }

    public float minus(float number1, float number2) {
        System.out.println(number1 + " " + number2);
        return number1 - number2;
    }

    public float multiple(float number1, float number2) {
        return number1 * number2;
    }

    public float divide(float number1, float number2) {
        if(number2 == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        } else {
            return number1 / number2;
        }
    }

    public float exp(float number1, float number2) {
        return (float) Math.pow(number1, number2);
    }

    public float calculate(float number1, float number2, String operator) {
        if(operator.equals("+")) {
            return number1 + number2;
        }
        else if(operator.equals("-")) {
            return number1 - number2;
        }
        else if(operator.equals("*")) {
            return number1 * number2;
        }
        else if(operator.equals("/")) {
            if(number2 == 0) {
                throw new IllegalArgumentException("Không thể chia cho 0");
            } else {
                return number1 / number2;
            }
        }
        else if (operator.equals("^")) {
            return (float) Math.pow(number1, number2);
        }
        else {
            throw new IllegalArgumentException("Phép toán không hợp lệ");
        }
    }
}
