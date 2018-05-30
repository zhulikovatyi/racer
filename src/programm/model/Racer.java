package programm.model;


public class Racer {
	
	
	private int racerX;
	private int racerY;
	
	public void setCoordinate(int x, int y) { // получаем координаты
		this.racerX = x;
		this.racerY = y;
	}
	
	public int getCoordinateX() { // возвращаем координату x
		return racerX - 1;
	}
	
    public int getCoordinateY() { // возвращаем координату y
    	return racerY - 1;
	}
}
	
    
