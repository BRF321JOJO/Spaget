package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Test extends Image {

    int counter = 0;
    public static boolean render = false;

    public boolean getRender () {
        return render;
    }
    public void setRender (boolean render) {
        this.render = render;
    }

    public Test(SpriteBatch batch) {
        super(
                new Texture("Lilypichu.png"),
                50,
                50,
                150,
                150,
                0,
                0,
                0,
                batch
        );
    }

    public void update(float delta) {

        //Loads and unloads rendered image
//        counter++;
//        if (counter %2 == 0) {
//            render = true;
//        } else {
//            render = false;
//        }

        //Up and Down
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            posy += 1;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            posy += -1;
        }

        //Left and Right
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            posx += -1;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            posx += 1;
        }
    }

    @Override
    public void render () {
        batch.draw(texture, posx, posy, width, height);
    }


}
