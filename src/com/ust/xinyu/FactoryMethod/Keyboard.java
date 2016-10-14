package com.ust.xinyu.FactoryMethod;

/**
 * Created by xzhua on 2016/10/14.
 */
public class Keyboard implements MyKeyboardInterface{
    MyButtonInterface[] buttons;
    public Keyboard(MyButtonInterface[] buttons){
        this.buttons=buttons.clone();
    }
    public void TestKeyboard(){
        for(int i=0;i<buttons.length;i++){
            System.out.println(buttons[i].getButtonId()+": "+buttons[i].getButtonStr());
        }
    }
}
