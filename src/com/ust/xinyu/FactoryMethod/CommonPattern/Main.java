package com.ust.xinyu.FactoryMethod.CommonPattern;

/**
 * Created by xzhua on 2016/10/14.
 */
public class Main {
    public static void main(String[] args){
        try {
            ClassFactory factory=new ClassFactory();
            MyInterface one = factory.produce("One");
            MyInterface two = factory.produce("Two");
            System.out.println(one.getStringFromDatabase(1));
            System.out.println(two.getStringFromDatabase(2));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
