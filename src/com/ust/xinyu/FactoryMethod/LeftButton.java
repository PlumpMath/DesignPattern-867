package com.ust.xinyu.FactoryMethod;

/**
 * Created by xzhua on 2016/10/14.
 */
public class LeftButton implements MyButtonInterface {
    @Override
    public int getButtonId() {
        return 4;
    }

    @Override
    public String getButtonStr() {
        return "Left";
    }
}
