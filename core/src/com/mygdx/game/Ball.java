package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Ball extends Entity {

    private static int size = 100;

    public Ball (SpriteBatch batch) {
        super (
                new Texture("Lilypichu.png"),
                (MyGdxGame.V_WIDTH-size)/2,
                (MyGdxGame.V_HEIGHT-size)/2,
                size,
                size,
                10,
                0,
                0,
                batch
        );
    }

    public void update(float delta) {
        posx += velx;
        posy += vely;

        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
            posx = (MyGdxGame.V_WIDTH-size)/2;
            posy = (MyGdxGame.V_HEIGHT-size)/2;
            velx = 10;
        }

        if (posy <= 0) {
            vely = -vely;
            posy=0;
        }

        if (posy >= MyGdxGame.V_HEIGHT - height) {
            vely = -vely;
            posy=MyGdxGame.V_HEIGHT - height;
        }

        if (posx <= 0) {
            velx = 0;
            vely = 0;
            posx = 0;
        }

        if (posx >= MyGdxGame.V_WIDTH - width) {
            velx = 0;
            vely = 0;
            posx = MyGdxGame.V_WIDTH - width;
        }
    }

    @Override
    public void render() {
        batch.draw(texture, posx, posy, width, height);
    }

    @Override
    public void handleCollision(Entity e) {
        System.out.println("Ball collide");
        velx = -velx;
        if (Gdx.input.isKeyPressed(Input.Keys.Y) || Gdx.input.isKeyPressed(Input.Keys.I)) {
            vely += Pong.velyconstant;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.H) || Gdx.input.isKeyPressed(Input.Keys.K)) {
            vely -= Pong.velyconstant;
        }
    }
}

