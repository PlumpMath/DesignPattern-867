package com.ust.xinyu.FactoryMethod.MethodPattern;

/**
 * Created by xzhua on 2016/10/14.
 */
public class ClassFactory {
    public MyInterface produceOne() throws Exception {
                return new MyClassOne();
    }
    public MyInterface produceTwo() throws Exception {
        return new MyClassTwo();
    }
}
