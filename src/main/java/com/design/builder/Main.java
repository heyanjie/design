package com.design.builder;

/**
 * @author heyanjie
 * @since 2021-04-29
 */
public class Main {
    public static void main(String[] args) {
        /*Builder builder = new ConcreteBuilder();
        Director1 director = new Director1(builder);
        Product product = director.construct();
        System.out.println(product.toString());*/
        Builder builder = new ConcreteBuilder();
        Director2 director = new Director2(builder);
        Product product = director.construct();
        System.out.println(product.toString());
    }
}
