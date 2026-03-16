package com.vaishnavi;
import java.util.Scanner;
public class ternary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		/*System.out.println((a>=90)?"A":(a>=80)?"B":(a>=70)?"C":(a>=60)?"D":"E");*/
		switch(a) {
		case 1:
			System.out.print("January ");
		case 2:
			System.out.print("February ");
		case 3:
			System.out.print("March ");
		case 4:
			System.out.print("April ");
		case 5:
			System.out.print("May ");
		case 6:
			System.out.print("June ");
		case 7:
			System.out.print("July ");
		case 8:
			System.out.print("August ");
		case 9:
			System.out.print("September ");
		case 10:
			System.out.print("October ");
		case 11:
			System.out.print("November ");
		case 12:
			System.out.print("December");
			break;
		default:
			System.out.println("Invalid Input");
	}
	}
}
