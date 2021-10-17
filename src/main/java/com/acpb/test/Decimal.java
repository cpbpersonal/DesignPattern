package com.acpb.test;

import java.math.BigDecimal;

public class Decimal {
    public static void main(String[] args) {
        BigDecimal decimal1 = new BigDecimal(Double.valueOf(3.0));
        BigDecimal decimal2 = new BigDecimal(Double.valueOf(1.0));

        BigDecimal divide = decimal1.divide(decimal2);
        System.out.println(divide);
        System.out.println(1.0/3.0);

    }
}
