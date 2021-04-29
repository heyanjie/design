package com.design.builder;

/**
 * @author heyanjie
 * @since 2021-04-29
 */
public class Main {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product.toString());
    }
}
