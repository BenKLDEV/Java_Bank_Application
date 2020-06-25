package simple_banking_application;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		//int a = scanner.nextInt();
		char c = scanner.next().charAt(0); 
		System.out.println("your character = " + c);
	}

}
