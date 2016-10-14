package com.ust.xinyu.FactoryMethod;

/**
 * Created by xzhua on 2016/10/14.
 */
public class AdvancedKeyboard implements MyKeyboardInterface{
    MyButtonInterface[] buttons;
    int testTime=0;
    public AdvancedKeyboard(MyButtonInterface[] buttons,int testTime){
        this.buttons=buttons.clone();
        this.testTime=testTime;
    }
    public void TestKeyboard(){
        for(int index=0;index<testTime;index++) {
            for (int i = 0; i < buttons.length; i++) {
                System.out.println(buttons[i].getButtonId() + ": " + buttons[i].getButtonStr());
            }
        }
    }
}
