package org.example;

public abstract class BaseDiscount implements Discount {
    Discount nextDiscount;



    protected abstract boolean isApplicable(Product product);

    protected abstract double calculateDiscount(Product product);

}
