package com.ust.xinyu.AbstractFactory;

import java.util.Stack;


/**
 * Created by xzhua on 2016/10/14.
 */
public class Ak47 implements GunPrototype {
    private Stack<BulletPrototype> bullets;
    public Ak47(){
        this.bullets=new Stack<BulletPrototype>();
    }
    @Override
    public void load(BulletPrototype[] bullets) {

        for(int i=0;i<bullets.length;i++){
            this.bullets.push(bullets[i]);
            System.out.println("AK47 is loading "+bullets[i].type());
        }

    }

    @Override
    public boolean fire() {
        if(this.bullets.empty()){
            return false;
        }
        else{
            System.out.println("AK47 is firing "+ bullets.pop().type());
            return true;
        }
    }
}
