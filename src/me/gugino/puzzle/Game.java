package me.gugino.puzzle;

import me.gugino.entitys.EntityPlayer;
import me.gugino.states.StateManager;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Game extends BasicGame{

	public static final String TITLE = "Puzzle Game";
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	public StateManager stateManager;
	
	public Game() {
		super(TITLE);
	}

	public static void main(String[] args) throws SlickException{
		AppGameContainer a = new AppGameContainer(new Game());
		
		a.setDisplayMode(WIDTH, HEIGHT, false);
		a.setAlwaysRender(true);
		a.setUpdateOnlyWhenVisible(false);
		a.setTargetFrameRate(60);
		a.setShowFPS(false);
		a.start();
	}

	public void init(GameContainer gc) throws SlickException {
		stateManager = new StateManager();
		stateManager.player = new EntityPlayer(400, 400);
	}

	public void update(GameContainer gc, int delta) throws SlickException {
		Input i = gc.getInput();
		
		stateManager.updateStates(delta, i);
	}

	public void render(GameContainer gc, Graphics g) throws SlickException {
		stateManager.renderStates(g);
	}
}
