package com.ust.xinyu.FactoryMethod;

/**
 * Created by xzhua on 2016/10/14.
 */
public class Main {
    public static void main(String args[]){
        /*I need a keyboard with arrow button on it*/
        /* I do not need to create button object by myself, I do not need to use these button objects to create a keyboard object by myself*/
        MyKeyboardInterface arrowKeyboard=KeyboardFactory.getArrowKeyboard();

        /*I then need to use the keyboard to do something*/
        arrowKeyboard.TestKeyboard();

        /*Now I want to upgrade my keyboard*/
        arrowKeyboard=KeyboardFactory.getAdvancedKeyboard();

        /*And I then want to use my advance keyboard*/
        arrowKeyboard.TestKeyboard();

         /*Now I want to upgrade my keyboard again*/
        arrowKeyboard=KeyboardFactory.getSuperKeyboard();

        /*And I then want to use my super keyboard*/
        arrowKeyboard.TestKeyboard();

        /*Some day, someone change the requirement document saying that we need to add a button to the arrow keyboard like leftDown, this client program do not need to change, we only need to change the KeyboardFactory Class*/


    }
}
