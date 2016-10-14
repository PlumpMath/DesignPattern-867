package com.ust.xinyu.FactoryMethod;

/**
 * Created by xzhua on 2016/10/14.
 */
public class UpButton implements MyButtonInterface {
    @Override
    public int getButtonId() {
        return 1;
    }

    @Override
    public String getButtonStr() {
        return "Up";
    }
}
