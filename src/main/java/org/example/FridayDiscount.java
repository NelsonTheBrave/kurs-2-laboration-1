package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayDiscount extends BaseDiscount {
    @Override
    protected boolean isApplicable(Product product) {
        return LocalDate.now().getDayOfWeek().equals(DayOfWeek.FRIDAY);
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.price * 0.1 * product.quantity;
    }

    @Override
    public double apply(Product product) {
        if (isApplicable(product)) {
            return calculateDiscount(product);
        }
        return nextDiscount.apply(product);
    }

    @Override
    public String getDescription(Product product) {
        return "Friday discount 10%";
    }
}