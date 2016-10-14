package com.ust.xinyu.FactoryMethod;

/**
 * Created by xzhua on 2016/10/14.
 */
public class KeyboardFactory {
    public static MyKeyboardInterface getArrowKeyboard(){
        MyButtonInterface arrows[]=new MyButtonInterface[4];
        arrows[0]=new UpButton();
        arrows[1]=new RightButton();
        arrows[2]=new DownButton();
        arrows[3]=new LeftButton();
        return new Keyboard(arrows);
    }
    public static MyKeyboardInterface getAdvancedKeyboard(){
        MyButtonInterface arrows[]=new MyButtonInterface[4];
        arrows[0]=new UpButton();
        arrows[1]=new RightButton();
        arrows[2]=new DownButton();
        arrows[3]=new LeftButton();
        return new AdvancedKeyboard(arrows,5);
    }

    public static MyKeyboardInterface getSuperKeyboard(){
        MyButtonInterface arrows[]=new MyButtonInterface[8];
        arrows[0]=new UpButton();
        arrows[1]=new RightButton();
        arrows[2]=new DownButton();
        arrows[3]=new LeftButton();

        arrows[4]=new LeftButton();
        arrows[5]=new DownButton();
        arrows[6]=new RightButton();
        arrows[7]=new UpButton();
        return new Keyboard(arrows);
    }
}
