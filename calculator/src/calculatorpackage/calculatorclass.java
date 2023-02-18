package calculatorpackage;

import java.util.Scanner;

public class calculatorclass {

	
	//Method for addition
	public static int add(int num1, int num2){
		
		return num1+num2;
	}
	//Method for subtraction
	public static int substract(int num1, int num2){
		
		return num1-num2;
	}
	//Method for multiplication
	public static int multiply(int num1, int num2){
		
		return num1*num2;
	}
	//Method for division
	public static double divide(double num1, double num2){
		
		return num1/num2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int input=sc.nextInt();
		System.out.println("Enter the second integer:");
		int input1=sc.nextInt();
		
		System.out.println("The addition is:" + calculatorclass.add(input,input1));
		System.out.println("The subtraction is:" + calculatorclass.substract(input,input1));
		System.out.println("The multiplication is:" + calculatorclass.multiply(input,input1));
		System.out.println("The division is:" + calculatorclass.divide(input,input1));

		}
	
}
