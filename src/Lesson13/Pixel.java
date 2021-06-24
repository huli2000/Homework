package Lesson13;

public class Pixel extends Point {
	
	private String color;
	
	public Pixel(int x, int y, String color) {
		super(x, y);
		this.color = color;
		System.out.println("Pixel(int x, int y, String color)");
		
		
	
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	

}
