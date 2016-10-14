package com.ust.xinyu.AbstractFactory;

/**
 * Created by xzhua on 2016/10/14.
 */
public interface GunFactory {
    public GunPrototype createGun(int bulletNum);

    //The following method is for your exercise, implement this method in right place so that the gun user can "buy" new right bullets from the right factory after they run out the ammo
    //public BulletPrototype[] createBullet(int bulletNumber);
}
