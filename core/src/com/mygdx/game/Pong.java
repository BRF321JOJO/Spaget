package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Pong extends Entity{

    //Fields
    private static int Pheight = 250;

    static int velyconstant = 1;


    static Sound Spaget = Gdx.audio.newSound(Gdx.files.internal("Spaget.mp3"));

    public Pong (SpriteBatch batch, int posx) {
        super (
                new Texture("Spaget.jpg"),
                posx,
                (MyGdxGame.V_HEIGHT-Pheight)/2,
                50,
                Pheight,
                0,
                0,
                0,
                batch
        );
    }

    public void update(float delta) {

        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
            Spaget.play(0.5f);
            Test.render = true;
        }
    }

    @Override
    public void render() {
        batch.draw(texture, posx, posy, width, height);
    }

    @Override
    public void handleCollision(Entity e) {
        System.out.println("Pong collide");
        Spaget.play(0.5f);
    }
}
