package com.design.factory.method;

/**
 * 中国咖啡工厂
 * @author heyanjie
 * @since 2021-04-28
 */
public class ChinaCoffeeFactory extends CoffeeFactory {

    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{new Cappuccino(), new Latte()};
    }

}