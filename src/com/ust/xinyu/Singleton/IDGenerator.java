package com.ust.xinyu.Singleton;

/**
 * Created by xzhua on 2016/10/15.
 */
public class IDGenerator {
    private IDGenerator(){

    }
    private int seed=1080;
    private int counter=0;
    private static IDGenerator generator=new IDGenerator();
    public static IDGenerator getInstance(){
        return generator;
    }



    public synchronized int getNextID(){
        int result=(seed)*counter*counter+2*counter+18;
        seed-=2;
        counter+=1;
        return result;
    }
}
