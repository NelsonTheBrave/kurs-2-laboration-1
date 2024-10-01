package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayDiscount extends BaseDiscount {
    public FridayDiscount() {
        super();
    }

    public FridayDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return LocalDate.now().getDayOfWeek().equals(DayOfWeek.FRIDAY);
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.price * 0.1 * product.quantity;
    }

    @Override
    protected String description(Product product) {
        return "Friday discount 10%";
    }
//    @Override
//    public String getDescription(Product product) {
//        return "Friday discount 10%";
//    }
}