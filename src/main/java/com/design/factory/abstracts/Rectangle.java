package com.design.factory.abstracts;

import javax.xml.ws.ServiceMode;

/**
 * @author heyanjie
 * @since 2021-04-28
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("画一个长方形");
    }
}
