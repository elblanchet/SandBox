package gui.dialogbox;

import levels.*;

public class Play {
	
	private Level _level;
	
	public Play(int levelNumber) {
		switch (levelNumber) {
		case 1:
			setLevel(new Level1());
			break;
		case 2:
			setLevel(new Level2());
			break;
		case 3:
			setLevel(new Level3());
			break;
		default:
			System.out.println("That level doesn't exist.");
			System.exit(0);
		}	
	}
	
	public void launch() {
		
	}
	
	public Level getLevel() {
		return _level;
	}
	
	public void setLevel(Level level) {
		_level = level;
	}
}
