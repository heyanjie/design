package com.design.factory.abstracts;

/**
 * @author heyanjie
 * @since 2021-04-28
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
