package JavaPrograms;
class Car {
	
	String carModel;
	
	public Car(){
		
		System.out.println("Inside Car Constructor");
		
	}
		
	public void startCar(){
		
		System.out.println("Starting Car: "+carModel);
		
	}
		
}

public class DemoClass {

	public static void main(String[] args) {
		
		Car benz = new Car();
		
		benz.carModel = "Benz A-Class";
		benz.startCar();

	}

}