package org.example;

public class MilkDiscount extends BaseDiscount {
    public MilkDiscount() {
        super();
    }

    public MilkDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return product.name.equals("Milk");
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.price * 0.05 * product.quantity;
    }

    @Override
    protected String description(Product product) {
        return "5% discount on milk";
    }

    //
//    @Override
//    public String getDescription(Product product) {
//        return "5% discount on milk";
//    }
}