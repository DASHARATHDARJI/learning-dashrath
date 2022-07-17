package basicofjava;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double LoanAmount = 100000;
		double IntrestRate = (double)10/(12*100); // Actual Rate In Percentage (10%) 
		double Tenure = 240; // in month
		
		
		double EMI = (LoanAmount*IntrestRate*Math.pow(1+IntrestRate,Tenure))/(Math.pow(1+IntrestRate,Tenure)-1);
		
		System.out.print("Emi Amount = " + EMI +"");
		
	
	}

}
