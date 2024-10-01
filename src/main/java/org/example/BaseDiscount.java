package org.example;

public abstract class BaseDiscount implements Discount {
    Discount nextDiscount;

    public BaseDiscount() {
        this.nextDiscount = null;
    }

    public BaseDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    protected abstract boolean isApplicable(Product product);

    protected abstract double calculateDiscount(Product product);

    protected abstract String description(Product product);

    @Override
    public double apply(Product product) {
        double discount = 0;
        if (isApplicable(product)) {
            discount = calculateDiscount(product);
        }
        if (nextDiscount != null) {
            discount += nextDiscount.apply(product);
        }

        return discount;
    }

    @Override
    public String getDescription(Product product) {
        String description = "";
        if (isApplicable(product)) {
            description = description(product) + "\n";
        }
        if (nextDiscount == null) {
            return description;
        }
        return description + nextDiscount.getDescription(product);
    }

}
