package gui.dialogbox;

import gui.buttons.MainMenuButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu extends Menu implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private static final String START = "Start";
	private static final String OPTION = "Option";
	private static final String QUIT = "Quit";
	
	private JPanel choicesPanel;
	
	private MainMenuButton startBtn;
	private MainMenuButton optionBtn;
	private MainMenuButton quitBtn;
	
	public MainMenu() {
		choicesPanel = new JPanel();
		startBtn = new MainMenuButton(START);
		optionBtn = new MainMenuButton(OPTION);
		quitBtn = new MainMenuButton(QUIT);
		
		choicesPanel.setLayout(new BoxLayout(choicesPanel, BoxLayout.PAGE_AXIS));
		add(choicesPanel, BorderLayout.CENTER);
		setBackground(Color.BLACK);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setVisible(true);
		
		choicesPanel.setBackground(Color.BLACK);
		
		
		choicesPanel.add(startBtn, BorderLayout.CENTER);
		choicesPanel.add(optionBtn, BorderLayout.CENTER);
		choicesPanel.add(quitBtn, BorderLayout.CENTER);
		
		startBtn.addActionListener(this);
		optionBtn.addActionListener(this);
		quitBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startBtn) {
			new LevelMenu(this);
			setVisible(false);
		}
		if (e.getSource() == optionBtn) {
			
		}
		if (e.getSource() == quitBtn) {
			System.exit(0);
		}
		
	}
}
