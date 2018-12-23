package com.javaguru.lessons.lesson11;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b).setScale(3, RoundingMode.HALF_EVEN);
    }
}
