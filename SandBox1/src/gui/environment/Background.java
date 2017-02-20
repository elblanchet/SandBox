package gui.environment;

import java.awt.Color;

public abstract class Background {

	public static enum ColorBackground {
		BLUE(Color.BLUE),
		YELLOW(Color.YELLOW),
		RED(Color.RED),
		GREEN(Color.GREEN);
		
		private final Color color;
		
		private ColorBackground(Color color) {
			this.color = color;
		}
		
		public Color getBackground() {
			return this.color;
		}
	}
	
	
	
}
