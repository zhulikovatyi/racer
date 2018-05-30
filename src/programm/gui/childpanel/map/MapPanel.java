package programm.gui.childpanel.map;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import programm.logic.CellController;

public class MapPanel extends JPanel{

	/*
	 *  ласс принимает значение методов из контроллера и отрисовывает графику
	 */
	private static final long serialVersionUID = 1L;
	
	private CellController cellPane;
	private final static int positionPanelX = 10; // позици€ расположени€ "карты"
	private final static int positionPanelY = 5;
		
	public MapPanel() {
		setBackground(Color.RED);
		setupView();
		setVisible(true);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// рисуем рабочую область
		g.setColor(Color.WHITE);
		g.fillRect(positionPanelX, positionPanelY, CellController.WIDTH*cellPane.CELL, CellController.WIDTH*cellPane.CELL);
		// рисуем линии
		
		// по x
		for (int i = positionPanelX; i <= CellController.WIDTH*cellPane.CELL + positionPanelX; i+= cellPane.CELL){
			g.setColor(Color.BLACK);
			g.drawLine(positionPanelX,i - positionPanelY,CellController.WIDTH*cellPane.CELL+positionPanelX,i - positionPanelY);
		}
		
		// по y
		for (int i = positionPanelY; i <= CellController.WIDTH*cellPane.CELL + positionPanelY; i+= cellPane.CELL) {
			g.setColor(Color.BLACK);
			g.drawLine(positionPanelY + i,positionPanelY,i + positionPanelY,CellController.WIDTH*cellPane.CELL + positionPanelY);
		}
		// рисуем объекты
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
				
				// отрисовываем границы
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

