package basicofjava;

public class Aeroplane {
	
	Aeroplane (){
		System.out.println("Aeroplane started");
	}
	Aeroplane(int speed){
		
		this ();
		
		this.speed = speed;
		}
	int speed;

	public void speed(){
		System.out.println(speed);
	
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aeroplane A = new Aeroplane(100);
		A.speed();
		Aeroplane B = new Aeroplane(50);
		B.speed();
		
		System.out.println("Total Speed Of Both Aeroplane");
		System.out.println(A.speed + B.speed);

	}
	}


