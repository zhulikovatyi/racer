package pro.sidorov.racer.gui.childpanel.map;

import java.awt.*;

import javax.swing.*;

import pro.sidorov.racer.logic.CellController;

public class MapPanel extends JPanel{

	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CellController cellPane;
	private final static int positionPanelX = 10; // расположение сетки по X
	private final static int positionPanelY = 5; // расположение сетки по Y
		
	public MapPanel() {
		setBackground(Color.RED);
		setupView();
		setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
	   // Рисуем рабочую область
		g.setColor(Color.WHITE);
		g.fillRect(positionPanelX, positionPanelY, CellController.WIDTH*cellPane.CELL, CellController.WIDTH*cellPane.CELL);
		
		// Рисуем сетку по X
		for (int i = positionPanelX; i <= CellController.WIDTH*cellPane.CELL + positionPanelX; i+= cellPane.CELL){
			g.setColor(Color.BLACK);
			g.drawLine(positionPanelX,i - positionPanelY,CellController.WIDTH*cellPane.CELL+positionPanelX,i - positionPanelY);
		}
		
		// Рисуем сетку по Y
		for (int i = positionPanelY; i <= CellController.WIDTH*cellPane.CELL + positionPanelY; i+= cellPane.CELL) {
			g.setColor(Color.BLACK);
			g.drawLine(positionPanelY + i,positionPanelY,i + positionPanelY,CellController.WIDTH*cellPane.CELL + positionPanelY);
		}
		// Рисуем объекты 0 - путое пространство / 1..4 Racer -1 / граница
		for(int i = 0; i < CellController.masMap.length; i++) {
			for(int j = 0 ; j < CellController.masMap.length ; j++) {
				
			    // Racer
				if (CellController.masMap[i][j] == 1) {
					g.setColor(Color.BLUE);
					g.fillRect(positionPanelX+i*cellPane.CELL+1, positionPanelY+j*cellPane.CELL+1, cellPane.CELL-1, cellPane.CELL-1);
				}
				if (CellController.masMap[i][j] == 2) {
					g.setColor(Color.RED);
					g.fillRect(positionPanelX+i*cellPane.CELL+1, positionPanelY+j*cellPane.CELL+1, cellPane.CELL-1, cellPane.CELL-1);
				}
				if (CellController.masMap[i][j] == 3) {
					g.setColor(Color.ORANGE);
					g.fillRect(positionPanelX+i*cellPane.CELL+1, positionPanelY+j*cellPane.CELL+1, cellPane.CELL-1, cellPane.CELL-1);
				}
				if (CellController.masMap[i][j] == 4) {
					g.setColor(Color.GREEN);
					g.fillRect(positionPanelX+i*cellPane.CELL+1, positionPanelY+j*cellPane.CELL+1, cellPane.CELL-1, cellPane.CELL-1);
				}
				if (CellController.masMap[i][j] == -1) {
					g.setColor(Color.BLACK);
					g.fillRect(positionPanelX+i*cellPane.CELL+1, positionPanelY+j*cellPane.CELL+1, cellPane.CELL-1, cellPane.CELL-1);
				}
			}
		}
	}
	
	private void setupView() {
		cellPane = new CellController();
		cellPane.controlGrid();
		cellPane.controlBorder();
		cellPane.controlRacer();
	}
}

