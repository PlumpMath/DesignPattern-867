package com.ust.xinyu.AbstractFactory;

/**
 * Created by xzhua on 2016/10/14.
 */
public class Ak47Bullet implements BulletPrototype {
    @Override
    public String type() {
        return "7.62×39mm cartridge";
    }
}
