package com.design.builder;

/**
 * @author heyanjie
 * @since 2021-04-29
 */
class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
       // builder.buildPartC();
        return builder.getResult();
    }
}
