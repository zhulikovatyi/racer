package programm.gui.main;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import programm.gui.childpanel.map.ControllPanel;
import programm.gui.childpanel.map.MapPanel;



public class ChildFormPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static JPanel leftGroupPanel;
	private static JPanel centerGroupPanel;
	public static JPanel rightGroupPanel;
	
	public static MapPanel mapPanel;
	public static ControllPanel controllPanel;
	
	ChildFormPanel(){
		setupView();
		setupGroupPanels();
		setupMapPanel();
		setVisible(true);
	}
// ---------------------------------------Отображение------------------------------------------------------------
	private void setupView() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	}
// ---------------------------------------------------------------------------------------------------------------
// ------------------------------Группы панелей-------------------------------------------------------------------
	private void setupGroupPanels() {
		// центральная панель
		centerGroupPanel = new JPanel();
		centerGroupPanel.setLayout(new BoxLayout(centerGroupPanel, BoxLayout.X_AXIS));
		add(centerGroupPanel);
	}
// ---------------------------------------------------------------------------------------------------------------
// Добавление классов отвечающих за определенную область (панель) групп панелей	
	private void setupMapPanel() {
		mapPanel = new MapPanel();
		centerGroupPanel.add(mapPanel); 
		
		controllPanel = new ControllPanel();
		centerGroupPanel.add(controllPanel);
		centerGroupPanel.setBackground(Color.RED);
	}
}
