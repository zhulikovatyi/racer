package programm.gui.mainpanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

import programm.gui.main.ChildForm;

public class ViewMainPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static ChildForm form1;
	private static JButton button;
	private static JButton button1;
	private static JButton button2;
	private static JButton button3;
	
	public ViewMainPanel(){
		setupView();
		setupViewPanel();
		setVisible(true);
	}
    
	public void initListeners() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				form1 = new ChildForm();
				form1.setVisible(true);
            }
		});
	}
	
	private void setupView() {
		setLayout(new GridLayout(1,3,30,30));
		Border etched = BorderFactory.createEtchedBorder();
		Border titled = BorderFactory.createTitledBorder(etched, "ѕанель меню");
		setBorder(titled);
//		setBackground(Color.RED);
	}
	private void setupViewPanel() {
		button = new JButton(" нопка перехода");
		add(button);
//		button.setPreferredSize(new Dimension(1000,200));
		button1 = new JButton(" нопка выхода");
		add(button1);
		button2 = new JButton(" нопка сброса?");
		add(button2);
		initListeners();
	}
}
