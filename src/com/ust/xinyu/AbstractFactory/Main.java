package com.ust.xinyu.AbstractFactory;

/**
 * Created by xzhua on 2016/10/14.
 */
public class Main {
    public static void main(String args[]){
         /*I want to buy a gun to shoot*/

         /*Find the factory first, emm let's try AK47*/
         GunFactory factory=new Ak47Factory();

        /*In Ak47 factory, I buy a gun*/
        GunPrototype gun=factory.createGun(30);
        gun.fire();

        /*Good Let's go to another factory to try pistol*/
        factory=new DesertEagleFactory();
        gun=factory.createGun(8);
        gun.fire();

        /*Look I do not need to worried about loading wrong bullets to wrong gun, while the ways I get gun and fire gun are independent with the type of the gun*/
    }

}
