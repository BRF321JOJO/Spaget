package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;

public class Img {

    public static final boolean render = false;

    public static boolean getRender () {
        return render;
    }

    //An image needs to have the following things defined
    Texture texture;
    int posx;
    int posy;
    int width;
    int height;

    int velx = 2;
    int vely = 2;


    //Define what an img is itself, and needs.
    //Allows us to reference an img whenever we want to.
    public Img () {
        texture = new Texture("chibicharacter.png");
        posx = 1;
        posy = 1;
        width = 100;
        height = 150;
    }

    public void update(float delta) {

        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            posy += vely;
        } else if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            posy -= vely;
        } else if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            posx -= velx;
        } else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            posx += velx;
        }


        //if (hit asteriod) {
        //decrase velocity by 1
    //}

        //posx+=velx;
        //posx *= velx;
        //posx = posx * velx



        //0, 78

        //move 1, vel = 1
        //move 2., vel = 2
    }
}
