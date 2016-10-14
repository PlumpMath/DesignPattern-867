package com.ust.xinyu.AbstractFactory;

/**
 * Created by xzhua on 2016/10/14.
 */
public class DesertEagleFactory implements GunFactory {
    /* Here is DesertEagle Factory, we need to make sure an DesertEagle is equipped with DesertEagleBullets*/
    @Override
    public GunPrototype createGun(int bulletNum) {
        GunPrototype product = new DesertEagle();
        BulletPrototype bullets[]=new BulletPrototype[bulletNum];
        for(int i=0;i<bulletNum;i++){
            bullets[i]=new DesertEagleBullet();
        }
        product.load(bullets);
        return product;
    }
}
