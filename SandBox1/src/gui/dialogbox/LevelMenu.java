package gui.dialogbox;

import gui.buttons.LevelMenuButton;
import gui.buttons.MainMenuButton;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LevelMenu extends Menu implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private static final String BACK = "Back";
	
	private Menu _backMenu;
	
	JPanel choicesPanel;
	JPanel optionsPanel;
	LevelMenuButton[] levels = new LevelMenuButton[40];
	MainMenuButton backBtn;
	
	public LevelMenu(Menu backMenu) {
		setBackMenu(backMenu);
		
		choicesPanel = new JPanel();
		optionsPanel = new JPanel();
		
		backBtn = new MainMenuButton(BACK);
		backBtn.addActionListener(this);
		
		choicesPanel.setLayout(new GridLayout(0,5));
		for (Integer level = 0; level < levels.length; ++level) {
			levels[level] = new LevelMenuButton(level + 1);
			choicesPanel.add(levels[level]);
			levels[level].setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		}
		add(choicesPanel, BorderLayout.NORTH);
		optionsPanel.setLayout(new FlowLayout());
		optionsPanel.add(backBtn, BorderLayout.SOUTH);
		add(optionsPanel);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == backBtn) {
			_backMenu.setVisible(true);
			this.setVisible(false);
		}
	}
	
	public Menu getBackMenu() {
		return _backMenu;
	}
	
	public void setBackMenu(Menu backMenu) {
		_backMenu = backMenu;
	}
}
