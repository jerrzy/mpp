package lesson3.labs.prob4;

public class Condo  implements Property{

	private int numberOfFloors;
	
	public Condo(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public double computeRent(){
		return 500 * numberOfFloors;
	}
}
