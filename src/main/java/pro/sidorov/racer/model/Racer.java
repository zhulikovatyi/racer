package pro.sidorov.racer.model;


public class Racer {
	
	private int racerX;
	private int racerY;
	
	private int speed;
	private int enduration;
	
	private String tactica;
	
	public void setOptions(int x, int y,int speed, int enduration, String tactic) { // Получаем параметры
		this.racerX = x;
		this.racerY = y;
		this.speed = speed;
		this.enduration = enduration;
		this.tactica = tactic;
	}
	
	public int getCoordinateX() { // получаем координату X
		return racerX - 1;
	}
	
    public int getCoordinateY() { // получаем координату Y
    	return racerY - 1;
	}
    
    public void move() {
    	int moverY = 50;
    	int moverX = 50;
    	for (int i = 1 ; i > 0; i--) {
    		moverX = moverX - 1;
			moverY = moverY - 1;
		}
    	moverY--;
    	System.out.println(moverY);
    	System.out.println(racerY);
    }
}
	
    
