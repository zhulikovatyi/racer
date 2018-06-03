package pro.sidorov.racer.logic;

import javax.swing.*;

import pro.sidorov.racer.gui.childpanel.map.ChildFormPanel;
import pro.sidorov.racer.model.Racer;


public class CellController {
	
	public static int[][] masMap;
	public final static int WIDTH = 120;
	public final int CELL = 5;
	
	
	public static Racer racer1 = new Racer();
	public static Racer racer2 = new Racer();
	public static Racer racer3 = new Racer();
	public static Racer racer4 = new Racer();
	
	public CellController(){
		setPositionRacer();
	}

	public void controlGrid() { // Заполняем сетку 0
		masMap = new int[WIDTH][WIDTH];
		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < WIDTH; j++) {
				masMap[i][j] = 0;
			}	
		}
	}
	
	public void controlRacer() { // Устанавливаем позиции агентам
		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < WIDTH; j++) {
				if(racer1.getCoordinateX() == i && racer1.getCoordinateY() == j) {
					masMap[i][j] = 1;
				}
				if(racer2.getCoordinateX() == i && racer2.getCoordinateY() == j) {
					masMap[i][j] = 2;
				}


                if(racer3.getCoordinateX() == i && racer3.getCoordinateY() == j) {
                	masMap[i][j] = 3;
				}
                
				if(racer4.getCoordinateX() == i && racer4.getCoordinateY() == j) {
					masMap[i][j] = 4;				
				}
			}
		}

	}	
	
	public void controlBorder() { // Устанавливаем позиции границам
		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < WIDTH; j++) {
				if(((i == (racer1.getCoordinateX() - 2) || i == (racer4.getCoordinateX() + 2)) && j >= ((WIDTH*2.4)/3)) || (i == racer1.getCoordinateX() - 1 || i == racer4.getCoordinateX() + 1)&& j <= ((WIDTH*2.4)/3)) {
					masMap[i][j] = -1;
				}
			}
		}
	}
	
	public void move() { // Движение
		racer1.move();
		racer2.move();
		racer3.move();
		racer4.move();
//		for (int i = 1; i < WIDTH; i++) {
//			for (int j = 1; j < WIDTH; j++) {
//				if(masMap[i][j] == 1) {
//					 masMap[i][j] = 0;
//					 masMap[i][j - 1] = 1;
//				}
//				if(masMap[i][j] == 2) {
//					if( j <= 5 ) {
//						masMap[i][j - 1] = 2;
//						masMap[i][j] = 0;
//					}
//					else {
//						masMap[i][j - 2] = 2;
//						masMap[i][j] = 0;
//					}
//				}
//				if(masMap[i][j] == 3) {
//					if( j <= 6 ) {
//						masMap[i][j - 1] = 3;
//						masMap[i][j] = 0;
//					}
//					else {
//						masMap[i][j - 3] = 3;
//						masMap[i][j] = 0;
//					}
//				}
//				if(masMap[i][j] == 4) {
//                    if( j <= 7 ) {
//                    	masMap[i][j - 1] = 4;
//						masMap[i][j] = 0;
//					}
//                    else {
//                    	masMap[i][j - 4] = 4;
//						masMap[i][j] = 0;
//                    }
//				}
//			}
//		}
	}
	
	public void win() {
		Object[] options = { "Готово" };
		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < WIDTH; j++) {
				if(masMap[i][0] == 1) {
					int exit = JOptionPane.showOptionDialog(ChildFormPanel.mapPanel,
			                   "Победил гонщик 1","Ski simulator",
			                   JOptionPane.PLAIN_MESSAGE,
			                   JOptionPane.QUESTION_MESSAGE,
			                   null,
			                   options,
			                   options[0]);
					if(exit == 0) {
						System.exit(0);
					}
				}
				if(masMap[i][0] == 2) {
					int exit = JOptionPane.showOptionDialog(ChildFormPanel.mapPanel,
			                   "Победил гонщик 2","Title",
			                   JOptionPane.PLAIN_MESSAGE,
			                   JOptionPane.QUESTION_MESSAGE,
			                   null,
			                   options,
			                   options[0]);
					if(exit == 0) {
						System.exit(0);
					}
				}
				if(masMap[i][0] == 3) {
					int exit = JOptionPane.showOptionDialog(ChildFormPanel.mapPanel,
			                   "Победил гонщик 3","Title",
			                   JOptionPane.PLAIN_MESSAGE,
			                   JOptionPane.QUESTION_MESSAGE,
			                   null,
			                   options,
			                   options[0]);
					if(exit == 0) {
						System.exit(0);
					}
				}
				if(masMap[i][0] == 4) {
					int exit = JOptionPane.showOptionDialog(ChildFormPanel.mapPanel,
			                   "Победил гонщик 4","Title",
			                   JOptionPane.PLAIN_MESSAGE,
			                   JOptionPane.QUESTION_MESSAGE,
			                   null,
			                   options,
			                   options[0]);
					if(exit == 0) {
						System.exit(0);
					}
				}
			}
		}
	}
	
	private void setPositionRacer() { // Класс сейчас инициализирует гонщиков
		racer1.setOptions((WIDTH/2 - 1),WIDTH,5,5,"qwe");
		racer2.setOptions((WIDTH/2),WIDTH,5,5,"erer");
		racer3.setOptions((WIDTH/2 + 1),WIDTH,5,5,"xc");
		racer4.setOptions((WIDTH/2 + 2),WIDTH,5,5,"hjg");
		
	}
}
