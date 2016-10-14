package com.ust.xinyu.FactoryMethod.MethodPattern;

/**
 * Created by xzhua on 2016/10/14.
 */
public class MyClassTwo implements MyInterface {

    @Override
    public String getStringFromDatabase(int objectID) {
        return "From Class Two result "+objectID;
    }
}
