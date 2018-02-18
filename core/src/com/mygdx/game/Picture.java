//This is an example class. Do not use.

package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Picture {

    Texture texture;
    int posx;
    int posy;
    int velx;
    int vely;
    int height;
    int width;

    //Method (mold)
    public Picture() {
        texture = new Texture("");
        width = 0;
        height = 0;
        posx = 0;
        posy = 0;
        velx = 0;
        vely = 0;
    }


    public void update(float delta) {

        //y = m(x) +b
        //y, final position
        //m is velocity
        //x is time (in updates/ frames)
        //b is the starting point

        //y = 2x + 80
    }


}
