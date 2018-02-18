package com.mygdx.game;

public class Public {

    //Public says any class in a directory can use it
    public int x = 10;
    //Public static says the value is static (unchanging)
    static public int  y = 10;


    Public (int y) {
        this.y = y;
    }
    //Cannot be used
    //Private.z;

}
