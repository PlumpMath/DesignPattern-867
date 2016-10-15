package com.ust.xinyu.Singleton;

/**
 * Created by xzhua on 2016/10/15.
 */
public class Main {
    public static void main(String args[]){
        /*Monday, I want to get 5 ID from the system*/
        System.out.println("Mon");
        first();
        /*Tuesday, I want to get 10 ID from the system*/
        System.out.println("Tue");
        second();
        /*Wednesday, I want to get 5 ID from the system*/
        System.out.println("Wed");
        first();
        /*Thursday, I want to get 10 ID from the system*/
        System.out.println("Thu");
        second();
    }

    /* This method is written by Ben to print 5 valid ID to console*/
    public static void first(){
        IDGenerator gen=IDGenerator.getInstance();
        for(int i=0;i<5;i++)
        System.out.println(gen.getNextID());
    }

    /* This method is written by Tom to print 10 valid ID to console*/
    public static void second(){
        IDGenerator gen=IDGenerator.getInstance();
        for(int i=0;i<10;i++)
        System.out.println(gen.getNextID());
    }
}
