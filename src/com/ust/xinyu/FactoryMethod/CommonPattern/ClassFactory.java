package com.ust.xinyu.FactoryMethod.CommonPattern;

/**
 * Created by xzhua on 2016/10/14.
 */
public class ClassFactory {
    public MyInterface produce(String classType) throws Exception {
        switch (classType){
            case "One":
                return new MyClassOne();

            case "Two":
                return new MyClassTwo();

            default:

                throw new Exception("No Matched type");

        }
    }
}
