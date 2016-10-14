package com.ust.xinyu.FactoryMethod;

/**
 * Created by xzhua on 2016/10/14.
 */
public class RightButton implements MyButtonInterface{
    @Override
    public int getButtonId() {
        return 2;
    }

    @Override
    public String getButtonStr() {
        return "Right";
    }
}
