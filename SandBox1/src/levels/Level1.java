package levels;

import gui.environment.Background.ColorBackground;

import java.awt.Color;

public class Level1 implements Level {

	private Color _background;
	
	private static final int NB_LEVEL = 1;
	
	public Level1() {
		this._background = ColorBackground.BLUE.getBackground();
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
