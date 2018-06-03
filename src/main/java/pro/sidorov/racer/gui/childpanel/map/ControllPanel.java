package pro.sidorov.racer.gui.childpanel.map;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import pro.sidorov.racer.logic.ControllPanelListiner;

public class ControllPanel extends JPanel {
	
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ControllPanelListiner control = new ControllPanelListiner();
	
	private JButton startButton; // Старт
	private JButton pauseButton; // Стоп
//	private JButton resetButton; Кнопки нет не вижу смысла
	
	public ControllPanel(){ 
		setupView();
		setupButtons();
		setVisible(true);
	}
	
	private void setupView() { 
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//		setBackground(Color.RED);
	}
	
	
	private void setupButtons() {
		startButton = new JButton("Старт");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control.startModel();
				startButton.setEnabled(false);
				pauseButton.setEnabled(true);
//				resetButton.setEnabled(true);
			}
		});
		add(startButton);
		// PAUSE
		pauseButton = new JButton("Стоп");
		pauseButton.setEnabled(false);
		pauseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllPanelListiner.pauseModel();
				startButton.setEnabled(true);
				pauseButton.setEnabled(false);
//				resetButton.setEnabled(true);
			}
		});
		add(pauseButton);
//		// RESET
//		resetButton = new JButton("�������");
//		resetButton.setEnabled(false);
//		resetButton.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				CellController.restartModel();
//				startButton.setEnabled(true);
//				pauseButton.setEnabled(false);
//				resetButton.setEnabled(true);
//			}
//		});
//		add(resetButton);
	}
}
