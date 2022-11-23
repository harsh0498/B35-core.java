package org.tnsindia.packagesdemo;

import java.util.Scanner;

//importing the class of another package
//import org.tnsindia.packagesdemo.ATM;
import org.tnsindia.packagesdemo.*;

//driver class
public class ATMexecutor {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the card no: ");
		String card_no=s.nextLine();
		ATM obj=new ATM();
		obj.display(card_no);
		

	}

}