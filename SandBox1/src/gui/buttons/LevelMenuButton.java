package gui.buttons;

import gui.dialogbox.Play;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class LevelMenuButton extends JButton implements MouseListener {

	private static final long serialVersionUID = 1L;

	public LevelMenuButton(Integer levelNumber) {
		setText(levelNumber.toString());
		setSize(new Dimension(50, 50));
		addMouseListener(this);
		makeStyle();
	}
	
	private void makeStyle() {
		Color[] gradients;
		Graphics2D graph2;
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		Play play = new Play((Integer.parseInt(((JButton) e.getSource()).getText())));
		play.launch();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
