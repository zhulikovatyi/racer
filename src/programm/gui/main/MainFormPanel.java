package programm.gui.main;

import javax.swing.*;

import programm.gui.mainpanel.ViewPanel;

public class MainFormPanel extends JPanel {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JPanel panel1;	
	public static JPanel viewPanel;
	
	MainFormPanel(){
		setupView();
		setupGroupPanels();
		setupViewPanel();
		setVisible(true);
	}
	
	private void setupView() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	}
	
	private void setupGroupPanels() {
		panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		add(panel1);
	}
	
	private void setupViewPanel() {
		viewPanel = new ViewPanel();
		panel1.add(viewPanel);
	}
}
