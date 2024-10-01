package org.example;

public class QuantityDiscount extends BaseDiscount {
    public QuantityDiscount() {
        super();
    }

    public QuantityDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return product.quantity >= 15;
    }

    @Override
    protected double calculateDiscount(Product product) {
        return 10 * product.quantity;
    }

    @Override
    protected String description(Product product) {
        return "10 kr discount per product if you buy 15 or more";
    }
//    @Override
//    public String getDescription(Product product) {
//        return "10 kr discount per product if you buy 15 or more";
//    }
}