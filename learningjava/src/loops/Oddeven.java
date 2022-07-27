package loops;

import java.util.Scanner;

public class Oddeven extends Forloop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter limit: ");
		//Integer num = sc.nextInt();
		
		
		
		for (int i=1; i <= 5 ; i++) {
			for (int j=1; j<=i; j++ ) {
				if (j%2==0) {
					System.out.print(2);
				}else {
					System.out.print(1);
				}
			}
				System.out.println();
			}
		}
		
}

