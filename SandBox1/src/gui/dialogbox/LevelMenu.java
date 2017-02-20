package gui.dialogbox;

import gui.buttons.LevelMenuButton;
import gui.buttons.MainMenuButton;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LevelMenu extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private static final String BACK = "Back";
	
	JPanel choicesPanel;
	JPanel optionsPanel;
	LevelMenuButton[] levels = new LevelMenuButton[40];
	MainMenuButton backBtn;
	
	public LevelMenu() {
		choicesPanel = new JPanel();
		optionsPanel = new JPanel();
		
		backBtn = new MainMenuButton(BACK);
		
		choicesPanel.setLayout(new GridLayout(0,5));
		for (Integer level = 0; level < levels.length; ++level) {
			levels[level] = new LevelMenuButton(level + 1);
			choicesPanel.add(levels[level]);
		}
		add(choicesPanel);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
