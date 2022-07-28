package Abstraction;

abstract class Vehicle {

	public abstract void vehicleTyre();
	public void Numberofpassenger() {
		System.out.println("Depend on vehicle type");
	}
}
class bus extends Vehicle{
	public void vehicleTyre() {
		System.out.println("The tyre of the bus are 6");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bus schoolbus = new bus();
		schoolbus.vehicleTyre();
		schoolbus.Numberofpassenger();
	}

}
