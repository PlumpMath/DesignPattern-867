package com.ust.xinyu.Singleton;

/**
 * Created by xzhua on 2016/10/15.
 */
public class Main2 {
    public static void main(String args[]){
        for(int j=0;j<10;j++) {
            int finalJ = j;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("In Thread "+ finalJ +" " + ComplexIDGenerator.getInstance().getNextID());
//                        try {
//                            Thread.sleep(500);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                    }
                }
            }).start();
        }
        for(int i=0;i<10;i++) {
            System.out.println("In Main Thread " + ComplexIDGenerator.getInstance().getNextID());
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
