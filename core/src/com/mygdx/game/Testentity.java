package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Testentity extends Entity {

    public Testentity(SpriteBatch batch) {
        super (
                new Texture("badlogic.jpg"),
                100,
                100,
                100,
                100,
                10,
                10,
                0,
                batch
        );
    }

    public void update(float delta) {

        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            posy += vely;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            posy -= vely;
        }

        //Left and Right
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            posx -= velx;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            posx += velx;
        }

    }

    @Override
    public void render(){
        batch.draw(texture, posx, posy, width, height);
    }

    @Override
    public void handleCollision(Entity e) {
        System.out.println("Testentitycollide");
    }

}
