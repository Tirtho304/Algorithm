package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("---------------Welcome To Student Report Card System----------");

	StudentReportCard studentReportCard = new StudentReportCard();

	int a []={40,20,60,70};
	String nam [] = {"Akif","Molla","Jaman","Badol"};
	studentReportCard.SortstudentResult(a,nam);
	studentReportCard.displayresult(a,nam);
		System.out.print("Enter The Number : ");
		int search = input.nextInt();
		int last = a.length-1;
	     studentReportCard.Search(a,search,0,last);
		System.out.print("Enter the index number : ");
	     int data = input.nextInt();
		a = studentReportCard.deleteitem(a,data);
		System.out.println("Report Card "+ Arrays.toString(a));
    }
}
