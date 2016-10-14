package com.ust.xinyu.FactoryMethod.StaticMethodPattern;

/**
 * Created by xzhua on 2016/10/14.
 */
public class ClassFactory {
    public static MyInterface produceOne() throws Exception {
                return new MyClassOne();
    }
    public static MyInterface produceTwo() throws Exception {
        return new MyClassTwo();
    }
}
