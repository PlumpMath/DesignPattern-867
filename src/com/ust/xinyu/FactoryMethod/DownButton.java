package com.ust.xinyu.FactoryMethod;

/**
 * Created by xzhua on 2016/10/14.
 */
public class DownButton implements MyButtonInterface {
    @Override
    public int getButtonId() {
        return 3;
    }

    @Override
    public String getButtonStr() {
        return "Down";
    }
}
