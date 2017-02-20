package characters.components;

import java.awt.Color;

public abstract class Component {
	
	private String _type;
	private Color _color;
	
	public String getType() {
		return _type;
	}
	
	public void setType(String type) {
		_type = type;
	}
	
	public Color getColor() {
		return _color;
	}
	
	public void setColor(Color color) {
		_color = color;
	}
}
