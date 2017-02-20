package levels;

import gui.environment.Background.ColorBackground;

import java.awt.Color;

public class Level2 implements Level {
	
	private Color _background;
	
	private static final int NB_LEVEL = 2;
	
	public Level2() {
		this._background = ColorBackground.RED.getBackground();
	}
	
	@Override
	public Color getBackground() {
		return this._background;
	}
	
	@Override
	public void setEnvironment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLevelNumber() {
		return NB_LEVEL;
	}

	
}
