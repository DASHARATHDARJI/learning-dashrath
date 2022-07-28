package Encapsulation;

public class GetterSetter {
	
	private int flatnumber;
	
	public int getflatnumber() {
		
		return flatnumber;
		}
public void setflatnumber(int flatnumber) {
	this.flatnumber = flatnumber;
}
	public static void main(String[] args) {
		
		GetterSetter Society = new GetterSetter();
		
		Society.setflatnumber(102);

		System.out.println("The Flat Number Is"+ Society.getflatnumber());
	}

}
