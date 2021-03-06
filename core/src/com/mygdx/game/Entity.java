package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public abstract class Entity {

    public Texture texture;
    public SpriteBatch batch;

    public int posx;
    public int posy;
    public int width;
    public int height;
    public int velx;
    public int vely;
    public int ID;

    public static ArrayList<Entity> entities = new ArrayList<Entity>();

    Entity (Texture texture, int posx, int posy, int width, int height, int velx, int vely, int ID, SpriteBatch batch) {
        this.texture = texture;
        this.posx = posx;
        this.posy = posy;
        this.width = width;
        this.height = height;
        this.velx = velx;
        this.vely = vely;
        this.ID = ID;
        this.batch = batch;
    }

    //Method


    public boolean isCollide (Entity e) {
        if (
                posx < e.posx + e.width     &&
                posx + width > e.posx       &&
                posy < e.posy + e.height    &&
                height + posy > e.posy
                )
        {
            return true;
        } else {
            return false;
        }
    }

    public abstract void render();
    public abstract void handleCollision(Entity e);
}
