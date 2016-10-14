package com.ust.xinyu.FactoryMethod.MethodPattern;

/**
 * Created by xzhua on 2016/10/14.
 */
public class MyClassOne implements MyInterface {
    @Override
    public String getStringFromDatabase(int objectID) {
        /*Some code to get data from a database*/
        return "From Class one result"+objectID;
    }
}
