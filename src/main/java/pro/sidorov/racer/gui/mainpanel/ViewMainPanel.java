package pro.sidorov.racer.gui.mainpanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

import pro.sidorov.racer.gui.main.ChildForm;
import pro.sidorov.racer.logic.CellController;


public class ViewMainPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static ChildForm form1;
	
	public static JButton buttonStart;
	private static JButton buttonExit;
	private static JButton buttonReset;
	
	private static JTextField jTextField1Form1;
	private static JTextField jTextField2Form1;
	
	private static JTextField jTextField1Form2;
	private static JTextField jTextField2Form2;
	
	private static JTextField jTextField1Form3;
	private static JTextField jTextField2Form3;
	
	private static JTextField jTextField1Form4;
	private static JTextField jTextField2Form4;
	
	private static String string1;
	private static String string2;
	private static String string3;
	private static String string4;
	
	private int i;
	private int i2;
	private int i3;
	private int i4;
	private int i5;
	private int i6;
	private int i7;
	private int i8;
	
	private CellController cellcontroller;
	
	public ViewMainPanel(){
		setupView();
		setupViewPanel();
		setVisible(true);
	}
    
	public void initListeners() { // В класс попадают значения из ViewRacerOption и здесь по нажатию кнопки значения должны попадать в модель
		buttonStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cellcontroller = new CellController();
				if(e.getSource() == buttonStart) {
					try {
					i = Integer.parseInt(jTextField1Form1.getText());
					i2 = Integer.parseInt(jTextField2Form1.getText());
					i3 = Integer.parseInt(jTextField1Form2.getText());
					i4 = Integer.parseInt(jTextField2Form2.getText());
					i5 = Integer.parseInt(jTextField1Form3.getText());
					i6 = Integer.parseInt(jTextField2Form3.getText());
					i7 = Integer.parseInt(jTextField1Form4.getText());
					i8 = Integer.parseInt(jTextField2Form4.getText());
					// Создаем второе окно 
					form1 = new ChildForm();
					form1.setVisible(true);
					}
					catch(Exception t) {
						JOptionPane.showMessageDialog(null, "Заполните все поля");
					}
				}
            }
		});
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
            }
		});
//		buttonReset.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				form1 = new ChildForm();
//				form1.setVisible(true);
//            }
//		});
	}
	
	static void getFormRacer1(JTextField text1,JTextField text2,String stringform1) {
		jTextField1Form1 = text1;
		jTextField2Form1 = text2;
		string1 = stringform1;
	}
	
	static void getFormRacer2(JTextField text1,JTextField text2,String stringform2) {
		jTextField1Form2 = text1;
		jTextField2Form2 = text2;
		string2 = stringform2;
	}

	static void getFormRacer3(JTextField text1,JTextField text2,String stringform3) {
		jTextField1Form3 = text1;
		jTextField2Form3 = text2;
		string3 = stringform3;
	}
	
	static void getFormRacer4(JTextField text1,JTextField text2,String stringform4) {
		jTextField1Form4 = text1;
		jTextField2Form4 = text2;
		string4 = stringform4;
	}
	
	private void setupView() {
		setLayout(new GridLayout(1,3,30,30));
		Border etched = BorderFactory.createEtchedBorder();
		Border titled = BorderFactory.createTitledBorder(etched, "Контрольная панель");
		setBorder(titled);
//		setBackground(Color.RED);
	}
	private void setupViewPanel() {
		buttonStart = new JButton("Начать моделирование");
		add(buttonStart);
		buttonExit = new JButton("Выход");
		add(buttonExit);
		buttonReset = new JButton("Очистить формы?"); // Пока не понял как сделать 
		add(buttonReset);
		initListeners();
	}
}
