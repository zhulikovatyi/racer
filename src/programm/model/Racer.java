package programm.model;


public class Racer {
	
	
	private int racerX;
	private int racerY;
	
	public void setCoordinate(int x, int y) { // �������� ����������
		this.racerX = x;
		this.racerY = y;
	}
	
	public int getCoordinateX() { // ���������� ���������� x
		return racerX - 1;
	}
	
    public int getCoordinateY() { // ���������� ���������� y
    	return racerY - 1;
	}
}
	
    
