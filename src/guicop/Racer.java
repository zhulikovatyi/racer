package guicop;

import guicop.*;

public class Racer {
	public int lenght = 1;
	
	public int speed = (int) (Math.random()*10);
	
	public int direction = 3;
	
	public int[] raserX = new int[100];
	public int[] raserY = new int[100];
	
	public Racer(int x0,int y0,int x1,int y1) {
		raserX[0] = x0;
		raserY[0] = y0;
		raserX[1] = x1;
		raserY[1] = y1;
	}
	
	public void move() {
		for (int i = lenght ; i > 0; i--) {
			raserX[i] = raserX[i - 1];
			raserY[i] = raserY[i - 1];
		}
		if (direction == 0) {
			raserX[0]++;
		}
		if (direction == 1) {
			raserY[0]++;
		}
		if (direction == 2) {
			raserX[0]--;
		}
		if (direction == 3) {
			raserY[0] = raserY[0] - speed;
		}
	
	}
	public void move_rascer() {
		for (int i = lenght ; i > 0; i--) {
			raserX[i] = raserX[i - 1];
			raserY[i] = raserY[i - 1];
		}
		if (direction == 0) {
			raserX[0]++;
		}
		if (direction == 1) {
			raserY[0]++;
		}
		if (direction == 2) {
			raserX[0]--;
		}
		if (direction == 3) {
			raserY[0]--;
		}
	}
}
