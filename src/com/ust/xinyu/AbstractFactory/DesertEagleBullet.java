package com.ust.xinyu.AbstractFactory;

/**
 * Created by xzhua on 2016/10/14.
 */
public class DesertEagleBullet implements BulletPrototype{
    @Override
    public String type() {
        return "12.7 mm bullet";
    }
}
