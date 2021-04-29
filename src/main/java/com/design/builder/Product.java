package com.design.builder;

import lombok.Data;

/**
 * @author heyanjie
 * @since 2021-04-29
 */
@Data
public class Product {

    private String partA;
    private String partB;
    private String partC;

    public void show() {
        //显示产品的特性
        System.out.println(partA);
    }
}
