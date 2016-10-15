package com.ust.xinyu.Singleton;


/**
 * Created by xzhua on 2016/10/15.
 */

/*This class is very expensive but is seldom used
* I hope I only create it when I need it*/
public class ComplexIDGenerator {
    private static ComplexIDGenerator generator=null;//Don't create it at this moment


    private int counter=0;
    private ComplexIDGenerator(){
        System.out.println("ComplexIDGenerator is under construction...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Loading Important thing...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hi We are setting things Up For you...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Checking for updating...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static synchronized void syncInit(){
        if(generator==null){
            generator=new ComplexIDGenerator();
        }
    }
    public static ComplexIDGenerator getInstance(){
        if(generator==null){
            syncInit();
        }
        return  generator;
    }


    public synchronized int getNextID(){
        counter+=1;
        return counter*counter;
    }



}
