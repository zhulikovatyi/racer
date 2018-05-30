package programm.gui.mainpanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import programm.gui.main.ChildForm;

public class ViewPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static ChildForm form1;
	private static JButton button;
	
	public ViewPanel(){
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
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	private void setupViewPanel() {
		button = new JButton("Кнопка перехода");
		add(button);
		initListeners();
	}
}
