package programm.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import programm.gui.childpanel.map.MapPanel;
import programm.gui.main.ChildFormPanel;
import programm.model.Racer;

public class CellController{
	
	public static int[][] masMap;
	public final static int WIDTH = 120;
	public final int CELL = 5;
	
	private static Timer timer;
	private MapPanel map; 
	
	Racer racer1 = new Racer();
	Racer racer2 = new Racer();
	Racer racer3 = new Racer();
	Racer racer4 = new Racer();
	
	public CellController(){
		setPositionRacer();
	}

	public void controlGrid() {
		masMap = new int[WIDTH][WIDTH];
		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < WIDTH; j++) {
				masMap[i][j] = 0;
			}	
		}
	}
	
	public void controlRacer() {
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
	
	public void controlBorder() {
		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < WIDTH; j++) {
				if(((i == (racer1.getCoordinateX() - 2) || i == (racer4.getCoordinateX() + 2)) && j >= ((WIDTH*2.4)/3)) || (i == racer1.getCoordinateX() - 1 || i == racer4.getCoordinateX() + 1)&& j <= ((WIDTH*2.4)/3)) {
					masMap[i][j] = -1;
				}
			}
		}
	}
	
	public static void move() {
		for (int i = 1; i < WIDTH; i++) { // проходим по массиву masMap
			for (int j = 1; j < WIDTH; j++) {
				if(masMap[i][j] == 1) {
					 masMap[i][j] = 0;
					 masMap[i][j - 1] = 1;
				}
				if(masMap[i][j] == 2) {
					if( j <= 5 ) {
						masMap[i][j - 1] = 2;
						masMap[i][j] = 0;
					}
					else {
						masMap[i][j - 2] = 2;
						masMap[i][j] = 0;
					}
				}
				if(masMap[i][j] == 3) {
					if( j <= 6 ) {
						masMap[i][j - 1] = 3;
						masMap[i][j] = 0;
					}
					else {
						masMap[i][j - 3] = 3;
						masMap[i][j] = 0;
					}
				}
				if(masMap[i][j] == 4) {
                    if( j <= 7 ) {
                    	masMap[i][j - 1] = 4;
						masMap[i][j] = 0;
					}
                    else {
                    	masMap[i][j - 4] = 4;
						masMap[i][j] = 0;
                    }
				}
			}
		}
	}
	
	
	public void startModel() {
		timer = new Timer(700, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				map = ChildFormPanel.mapPanel;
				move();
				map.repaint();
			}
			  
		}
	    );
		timer.start();
	}
	public static void pauseModel() {
		timer.stop();
	}
	
	private void setPositionRacer() {
		racer1.setCoordinate((WIDTH/2 - 1),WIDTH);
		racer2.setCoordinate((WIDTH/2),WIDTH);
		racer3.setCoordinate((WIDTH/2 + 1),WIDTH);
		racer4.setCoordinate((WIDTH/2 + 2),WIDTH);
		
	}
//	public static void restartModel() {
//		timer.stop();
//	}
}
