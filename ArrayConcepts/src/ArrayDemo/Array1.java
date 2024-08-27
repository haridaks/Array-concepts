package ArrayDemo;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		int mark[] = new int [100];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mark");
		mark[0]= sc.nextInt();
		System.out.println("mark in maths:"+ mark[0]);
	}

}
