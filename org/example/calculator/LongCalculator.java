package org.example.calculator;

public class LongCalculator implements Calculator<Long> {

    @Override
    public Long add(Long a, Long b) {
        return a + b;
    }

    @Override
    public Long sub(Long a, Long b) {
        return a - b;
    }

    @Override
    public Long multi(Long a, Long b) {
        return a * b;
    }

    @Override
    public Long div(Long a, Long b) {
        if (b == 0L) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}