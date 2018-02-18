package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//If the screen is resizable
		config.resizable=true;
		config.height = MyGdxGame.V_HEIGHT;
		config.width = MyGdxGame.V_WIDTH;
		//Frames Per Second
		config.foregroundFPS=60;
		config.vSyncEnabled=true;
		new LwjglApplication(new MyGdxGame(), config);
	}
}
