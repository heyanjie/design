package com.design.factory.method;

/**
 * 美国咖啡工厂
 * @author heyanjie
 * @since 2021-04-28
 */
public class AmericaCoffeeFactory extends CoffeeFactory {

    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{new Americano(), new Latte()};
    }

}
