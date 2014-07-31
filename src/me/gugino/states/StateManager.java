package me.gugino.states;

import me.gugino.entitys.EntityPlayer;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class StateManager {
	
	public States currentState = States.LEVEL_ONE;
	
	public EntityPlayer player;
	
	public enum States {
		TITLE_STATE, LEVEL_ONE, LEVEL_TWO, LEVEL_THREE, END
	}
	
	public void updateStates(int delta, Input i){
		switch(currentState){
		case TITLE_STATE:
			break;
			
		case LEVEL_ONE:
			player.update(i, delta);
			break;
		
		case LEVEL_TWO:
			break;
			
		case LEVEL_THREE:
			break;
			
		case END:
			break;
		
		default:
			currentState = States.TITLE_STATE;
			break;
		}
	}
	
	public void renderStates(Graphics g){
		switch(currentState){
		case TITLE_STATE:
			break;
			
		case LEVEL_ONE:
			player.render(g);
			break;
		
		case LEVEL_TWO:
			break;
			
		case LEVEL_THREE:
			break;
			
		case END:
			break;
		
		default:
			currentState = States.TITLE_STATE;
			break;
		}
	}
}
