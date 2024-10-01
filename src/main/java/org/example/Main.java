package org.example;

public class Main {
    public static void main(String[] args) {
//        List<Product> products = new ArrayList<>();
        Product milk = new Product("Milk", 18, 16);
        Product bread = new Product("Bread", 35, 20);
        Product butter = new Product("Butter", 55, 1);

        Discount discountChain = new FridayDiscount(new QuantityDiscount(new MilkDiscount()));

        System.out.println("Milk discount: " + discountChain.apply(milk));
        System.out.println("Bread discount: " + discountChain.apply(bread));
        System.out.println("Butter discount: " + discountChain.apply(butter));
        System.out.println();
        System.out.println("Applied discounts on milk: \n" + discountChain.getDescription(milk));
        System.out.println("Applied discounts on butter: \n" + discountChain.getDescription(butter));
    }
}