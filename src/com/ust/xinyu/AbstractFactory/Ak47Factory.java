package com.ust.xinyu.AbstractFactory;

/**
 * Created by xzhua on 2016/10/14.
 */
public class Ak47Factory implements GunFactory {
    /* Here is Ak47 Factory, we need to make sure an AK47 is equipped with Ak47Bullets*/
    @Override
    public GunPrototype createGun(int bulletNum) {
        GunPrototype product = new Ak47();
        BulletPrototype bullets[]=new BulletPrototype[bulletNum];
        for(int i=0;i<bulletNum;i++){
            bullets[i]=new Ak47Bullet();
        }
        product.load(bullets);
        return product;
    }
}
