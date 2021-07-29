package OOP.NewTargil;

public class Car {

	private int number;
	private int speed;

	public Car(int number, int speed) {
		super();
		this.number = number;
		this.setSpeed(speed);
	}

//	public Car() {
//		super();
//	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) throws RuntimeException {
		if (speed < 110 || speed > 0) {
			this.speed = speed;
			return;
		}
	throw new RuntimeException("speed in out of range");
	
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + "]";
	}
	
}
