package com.ust.xinyu.FactoryMethod.StaticMethodPattern;

/**
 * Created by xzhua on 2016/10/14.
 */
public class Main {
    public static void main(String[] args){
        try {
            MyInterface one = ClassFactory.produceOne();
            MyInterface two = ClassFactory.produceTwo();
            System.out.println(one.getStringFromDatabase(1));
            System.out.println(two.getStringFromDatabase(2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
