package programm.gui.main;

import javax.swing.*;

public class MainForm extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainForm(){
		setupView();
		setupPanel();
		setVisible(true);
	}
	
	private void setupView() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
		}
		catch (Exception e) { 
			e.printStackTrace();
		}
		setTitle("Ski Emulator");
		setBounds( 100,100, 1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void setupPanel() {
		add(new MainFormPanel());
	}
}