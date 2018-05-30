package programm.gui.childpanel.map;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import programm.logic.CellController;

public class ControllPanel extends JPanel{
	
	/*
	 * ������
	 */
	private static final long serialVersionUID = 1L;

	CellController control = new CellController();
	
	private JButton startButton; // �����
	private JButton pauseButton; // �����
//	private JButton resetButton; �� ������� ��� ������� ������, ���� ��� � ������
	
	public ControllPanel(){ // ���������� ������
		setupView();
		setupButtons();
		setVisible(true);
	}
	
	private void setupView() { // ����������� ������ �� ������
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.RED);
	}
	
	private void setupButtons() {// ������
		startButton = new JButton("�����");
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.startModel();
				startButton.setEnabled(false);
				pauseButton.setEnabled(true);
//				resetButton.setEnabled(true);
			}
		});
		add(startButton);
		// PAUSE
		pauseButton = new JButton("�����");
		pauseButton.setEnabled(false);
		pauseButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CellController.pauseModel();
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
