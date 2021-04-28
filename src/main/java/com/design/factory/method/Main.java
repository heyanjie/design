package com.design.factory.method;

import com.design.factory.simple.Product;
import com.design.factory.simple.ProductFactory;

/**
 * @author heyanjie
 * @since 2021-04-28
 */
public class Main {
   public static void print(Coffee[] c){
        for (Coffee coffee : c) {
            System.out.println(coffee.getName());
        }
    }

    public static void main(String[] args) {
        CoffeeFactory chinaCoffeeFactory = new ChinaCoffeeFactory();
        Coffee[] chinaCoffees = chinaCoffeeFactory.createCoffee();
        System.out.println("中国咖啡工厂可以生产的咖啡有：");
        print(chinaCoffees);
       /* CoffeeFactory americaCoffeeFactory = new AmericaCoffeeFactory();
        Coffee[] americaCoffees = americaCoffeeFactory.createCoffee();
        System.out.println("美国咖啡工厂可以生产的咖啡有：");
        print(americaCoffees);*/
    }
}


