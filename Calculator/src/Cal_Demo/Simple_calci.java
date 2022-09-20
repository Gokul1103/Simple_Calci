package Cal_Demo;

import java.util.Scanner;

public class Simple_calci {
	
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		char Operator = 0;
		double answer = 0.0;
		
		//Using Switch cases
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st Number: ");
		
		num1 = input.nextInt();
		
		System.out.println("Enter the 2nd Number: ");
		
		num2 = input.nextInt();
		
		System.out.println("What operator");
		
		Operator = input.next().charAt(0); 
		
		switch(Operator) {
		
		case'+' : answer = num1+num2;
		
		         break;
		         
		case'-' : answer = num1-num2;
		
                 break;         
		
		case'*' : answer = num1*num2;
		
                 break;
		
		case'/' : answer = num1/num2;
		
                  break;
		}
 
	System.out.println(num1+" "+Operator+" "+num2+" = "+answer);
	
}

}
