package gui.dialogbox;

import gui.buttons.MainMenuButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu extends JFrame implements ActionListener {

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
		add(choicesPanel);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setVisible(true);
		
		choicesPanel.add(startBtn);
		choicesPanel.add(optionBtn);
		choicesPanel.add(quitBtn);
		
		startBtn.addActionListener(this);
		optionBtn.addActionListener(this);
		quitBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startBtn) {
			setVisible(false);
			new LevelMenu();
		}
		if (e.getSource() == optionBtn) {
			
		}
		if (e.getSource() == quitBtn) {
			System.exit(0);
		}
		
	}
}
