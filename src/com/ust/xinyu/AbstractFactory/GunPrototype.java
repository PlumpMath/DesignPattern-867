package com.ust.xinyu.AbstractFactory;

/**
 * Created by xzhua on 2016/10/14.
 */
public interface GunPrototype {
    public void load(BulletPrototype[] bullets);
    public boolean fire();
}
