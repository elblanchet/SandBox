package levels;

import gui.environment.Background.ColorBackground;

import java.awt.Color;

public class Level3 implements Level {

	private Color _background;
	
	private static final int LEVEL_NUMBER = 3;
	
	public Level3() {
		this._background = ColorBackground.YELLOW.getBackground();
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
		return LEVEL_NUMBER;
	}

}
