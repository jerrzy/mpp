package lesson5.labs.prob3;

public class Rectangle  implements Graph {
	
	
	private double width;
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	private double length;
	@Override
	public double ComputeArea() {
		// TODO Auto-generated method stub
		return width * length;
	}
	

}
