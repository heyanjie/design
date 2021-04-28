package com.design.factory.method;

/**
 * 定义一个抽象的咖啡工厂
 * @author heyanjie
 * @since 2021-04-28
 */
public abstract class CoffeeFactory {

    /**
     * 生产可制造的咖啡
     * @return
     */
    public abstract Coffee[] createCoffee();

}
