package gui.dialogbox;

import gui.buttons.MainMenuButton;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class MainMenu implements ActionListener {

	private static final String START = "Start";
	private static final String OPTION = "Option";
	private static final String QUIT = "Quit";
	
	
	private JPanel btnPanel;
	
	private JFrame containerFr;
	
	private MainMenuButton startBtn;
	private MainMenuButton optionBtn;
	private MainMenuButton quitBtn;
	
	public MainMenu() {
		btnPanel = new JPanel();
		containerFr = new JFrame();
		startBtn = new MainMenuButton(START);
		optionBtn = new MainMenuButton(OPTION);
		quitBtn = new MainMenuButton(QUIT);
		
		btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.PAGE_AXIS));
		containerFr.add(btnPanel);
		containerFr.setExtendedState(JFrame.MAXIMIZED_BOTH);
		containerFr.setUndecorated(true);
		containerFr.setVisible(true);
		
		btnPanel.add(Box.createHorizontalGlue());
		
		btnPanel.add(startBtn);
		btnPanel.add(optionBtn);
		btnPanel.add(quitBtn);
		
		startBtn.addActionListener(this);
		optionBtn.addActionListener(this);
		quitBtn.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startBtn) {
			
		}
		if (e.getSource() == optionBtn) {
			
		}
		if (e.getSource() == quitBtn) {
			System.exit(0);
		}
		
	}
}
