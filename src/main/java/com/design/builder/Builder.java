package com.design.builder;

/**
 * @author heyanjie
 * @since 2021-04-29
 */
public abstract class Builder {

    //创建产品对象
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult() {
        return product;
    }

}
