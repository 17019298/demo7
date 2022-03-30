package Basiccommands;

import java.util.Scanner;

public class AdditionOfStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner y= new Scanner(System.in);
		String e="trybest";
		String f="trybest";
		String h="trybest";
		System.out.println("Enter three Strings= ");
		e=y.next();
		f=y.next();
		h=y.next();
		System.out.println("Addition of three Strings= " +(e+f+h));
	}

}
