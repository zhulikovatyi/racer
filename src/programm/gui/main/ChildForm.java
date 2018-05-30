package programm.gui.main;

import javax.swing.*;

public class ChildForm extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChildForm() {
		super("Ski Emulator");
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
		setBounds( 100,100, 700, 650);
//		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void setupPanel() {
		ChildFormPanel pnl = new ChildFormPanel();
		add(pnl);
	}
}
