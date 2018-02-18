package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Background extends Image {

    public Background(SpriteBatch batch) {
        super(
                new Texture("Sakura tree large.jpg"),
                0,
                0,
                MyGdxGame.V_WIDTH,
                MyGdxGame.V_HEIGHT,
                0,
                0,
                0,
                batch
        );
    }

    public void update(float delta) {

    }


    @Override
    public void render() {batch.draw(texture,posx,posy,width,height);}

}