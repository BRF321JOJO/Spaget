package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class GameScreen implements Screen {

    //Fields
    private MyGdxGame game;
    private OrthographicCamera gameCam;
    private Viewport gamePort;
    private final int LEVEL_WIDTH;
    private final int LEVEL_HEIGHT;

    Background background;
    Test test;
    Img img;
    Pong[] pong;
    Ball ball;
    Testentity testentity;


    //Constructor
    public GameScreen(MyGdxGame game) {
        this.game = game;

        LEVEL_WIDTH = MyGdxGame.V_WIDTH;
        LEVEL_HEIGHT = MyGdxGame.V_HEIGHT;
        gameCam = new OrthographicCamera();
        gamePort = new ExtendViewport(LEVEL_WIDTH, LEVEL_HEIGHT, gameCam);

        test = new Test(game.batch);
        img = new Img();
        background = new Background(game.batch);

        pong = new Pong[2];
        //Tells how multiple paddles will spawn
        for (int i = 0; i <= 1; i++) {
            pong[i] = new Pong(game.batch, i * 1620 + 100);
            Entity.entities.add(pong[i]);
        }

        ball = new Ball(game.batch);
        //Entity.entities.add(ball);

        testentity = new Testentity(game.batch);
        //Entity.entities.add(testentity);
    }

    //Methods
    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        update(delta);

        //Clears Screen
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //Allows images to be transparent
        //game.batch.enableBlending();

        game.batch.begin();

        //background.render();

        if (Test.render) {
            test.render();
        }

        if (Img.getRender()) {
            game.batch.draw(img.texture, img.posx, img.posy, img.width, img.height);
        }

        for (int i = 0; i <= 1; i++) {
            pong[i].render();
        }

        ball.render();
        testentity.render();

        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
    }

    //Updates game using update method in each class
    public void update(float delta) {
        test.update(delta);
        img.update(delta);
        background.update(delta);


        for (int i = 0; i <= 1; i++) {
            pong[i].update(delta);
            pong[i].vely = 10;
        }

        //Next 4 statements move the pong paddles
        if (Gdx.input.isKeyPressed(Input.Keys.Y) && pong[0].posy < MyGdxGame.V_HEIGHT - pong[0].height) {
            pong[0].posy += pong[0].vely;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.H) && pong[0].posy > 0) {
            pong[0].posy -= pong[0].vely;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.I) && pong[1].posy < MyGdxGame.V_HEIGHT - pong[1].height) {
            pong[1].posy += pong[1].vely;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.K) && pong[1].posy > 0) {
            pong[1].posy -= pong[1].vely;
        }


        ball.update(delta);
        testentity.update(delta);

        for (Entity e : Entity.entities) {

//            if (testentity.isCollide(e)) {
//                testentity.handleCollision(e);
//                e.handleCollision(testentity);
//            }

            if (ball.isCollide(e)) {
                ball.handleCollision(e);
                e.handleCollision(ball);
            }

//            for (int i = 0; i <= 1; i++) {
//                if (pong[i].isCollide(e)) {
//                    pong[i].handleCollision(e);
//                    e.handleCollision(pong[i]);
//                }
//
//            }
        }



    }
}