package gui.buttons;

import gui.dialogbox.Play;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LevelMenuButton extends JButton implements ActionListener {

	private static final long serialVersionUID = 1L;

	public LevelMenuButton(Integer levelNumber) {
		setText(levelNumber.toString());
		setSize(new Dimension(50, 50));
		setMargin(new Insets(10,10,10,10));
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Play play = new Play((Integer.parseInt(((JButton) e.getSource()).getText())));
		play.launch();
	}
}
