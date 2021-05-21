package learn.myjava;

import java.util.Scanner;

public class FlowStmt {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		for(int i=0;i<5;i++) {
			System.out.println(array[i]);
		}
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = scanner.nextInt();
		
		if ((a>0) && (a<=100)) {
			System.out.println("number is a small number");
		}else if ((a>100) && (a<=1000)) {
			System.out.println("number is a medium number");
		}else if ((a>1000) && (a<=10000)) {
			System.out.println("number is a big number");
		}else {
			System.out.println("number is 0 or not in required specified range");
		}
		System.out.println("Hello Java");
		
		scanner.close();
	
	}
}