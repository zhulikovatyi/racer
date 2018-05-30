package programm.gui.mainpanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class ViewRacerOption extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private static JPanel formRacer1;
	private static JPanel formRacer2;
	private static JPanel formRacer3;
	private static JPanel formRacer4;
	
	private JTextField forceRacer1;
	private JTextField enduranceRacer1;
	private ButtonGroup groupRacer1;
	
	private JTextField forceRacer2;
	private JTextField enduranceRacer2;
	private ButtonGroup groupRacer2;
	
	private JTextField forceRacer3;
	private JTextField enduranceRacer3;
	private ButtonGroup groupRacer3;
	
	private JTextField forceRacer4;
	private JTextField enduranceRacer4;
	private ButtonGroup groupRacer4;
	
	private JRadioButton staierRadio;
	private JRadioButton sprinterRadio;
	private JRadioButton normalRadio;
	
	public ViewRacerOption(){
		setupView();
		setupGroupPanels();
		setupViewPanel1();
		setupViewPanel2();
		setupViewPanel3();
		setupViewPanel4();
		setVisible(true);
	}
    
	private void setupView() {
		setLayout(new GridLayout(1,4,10,10));
//		setBackground(Color.RED);
	}
	private void setupGroupPanels() {
		formRacer1 = new JPanel();
		formRacer2 = new JPanel();
		formRacer3 = new JPanel();
		formRacer4 = new JPanel();
		
		formRacer1.setLayout(new GridLayout(5,1,10,10));
		add(formRacer1);
		Border etched1 = BorderFactory.createEtchedBorder();
		Border titled1 = BorderFactory.createTitledBorder(etched1, "Панель 1");
		formRacer1.setBorder(titled1);
		
		formRacer2.setLayout(new GridLayout(5,1,10,10));
		add(formRacer2);
		
		Border etched2 = BorderFactory.createEtchedBorder();
		Border titled2 = BorderFactory.createTitledBorder(etched2, "Панель 2");
		formRacer2.setBorder(titled2);
		
		formRacer3.setLayout(new GridLayout(5,1,10,10));
		add(formRacer3);
		
		Border etched3 = BorderFactory.createEtchedBorder();
		Border titled3 = BorderFactory.createTitledBorder(etched3, "Панель 3");
		formRacer3.setBorder(titled3);
		
		formRacer4.setLayout(new GridLayout(5,1,10,10));
		add(formRacer4);
		
		Border etched4 = BorderFactory.createEtchedBorder();
		Border titled4 = BorderFactory.createTitledBorder(etched4, "Панель 4");
		formRacer4.setBorder(titled4);
	}
	
	private void setupViewPanel1() {
		forceRacer1 = new JTextField();
		formRacer1.add(forceRacer1);
		
		enduranceRacer1 = new JTextField();
		formRacer1.add(enduranceRacer1);
		
		groupRacer1 = new ButtonGroup();
		
		staierRadio = new JRadioButton("Стаер", false);
		sprinterRadio = new JRadioButton("Спринтер", false);
		normalRadio = new JRadioButton("Стаер", true);
		
		groupRacer1.add(staierRadio);
		groupRacer1.add(sprinterRadio);
		groupRacer1.add(normalRadio);
		
		formRacer1.add(staierRadio);
		formRacer1.add(sprinterRadio);
		formRacer1.add(normalRadio);
		
		
	}
	
	private void setupViewPanel2() {
		forceRacer2 = new JTextField();
		formRacer2.add(forceRacer2);
		
		enduranceRacer2 = new JTextField();
		formRacer2.add(enduranceRacer2);
		
        groupRacer2 = new ButtonGroup();
		
		staierRadio = new JRadioButton("Стаер", false);
		sprinterRadio = new JRadioButton("Спринтер", false);
		normalRadio = new JRadioButton("Стаер", true);
		
		groupRacer2.add(staierRadio);
		groupRacer2.add(sprinterRadio);
		groupRacer2.add(normalRadio);
		
		formRacer2.add(staierRadio);
		formRacer2.add(sprinterRadio);
		formRacer2.add(normalRadio);
	}
	
	private void setupViewPanel3() {
		forceRacer3 = new JTextField();
		formRacer3.add(forceRacer3);
		
		enduranceRacer3 = new JTextField();
		formRacer3.add(enduranceRacer3);
		
		groupRacer3 = new ButtonGroup();
		
		staierRadio = new JRadioButton("Стаер", false);
		sprinterRadio = new JRadioButton("Спринтер", false);
		normalRadio = new JRadioButton("Стаер", true);
		
		groupRacer3.add(staierRadio);
		groupRacer3.add(sprinterRadio);
		groupRacer3.add(normalRadio);
		
		formRacer3.add(staierRadio);
		formRacer3.add(sprinterRadio);
		formRacer3.add(normalRadio);
	}
	
	private void setupViewPanel4() {
		forceRacer4 = new JTextField();
		formRacer4.add(forceRacer4);
		
		enduranceRacer4 = new JTextField();
		formRacer4.add(enduranceRacer4);
		
		groupRacer4 = new ButtonGroup();
		
		staierRadio = new JRadioButton("Стаер", false);
		sprinterRadio = new JRadioButton("Спринтер", false);
		normalRadio = new JRadioButton("Стаер", true);
		
		groupRacer4.add(staierRadio);
		groupRacer4.add(sprinterRadio);
		groupRacer4.add(normalRadio);
		
		formRacer4.add(staierRadio);
		formRacer4.add(sprinterRadio);
		formRacer4.add(normalRadio);
	}
}
