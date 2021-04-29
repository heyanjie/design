package com.design.factory.abstracts;

/**
 * @author heyanjie
 * @since 2021-04-28
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画一个圆圈");
    }
}