package edu.handong.see.java.lab09;

import java.util.Scanner;

public class SalesReporter {	//declare public class

	private double highestSales;	//declare private double member
	private double averageSales;	//declare private double member
	private SalesAssociate[] team;	//declare private array member
	private int numberOfAssociate;	//declare private integer member

	public static void main(String[] args) {	//declare public void main method

		SalesReporter analyze = new SalesReporter();	//SalesReporter declare analyze and has same function by using new
		analyze.getData();	//analyze call getData
		analyze.computeStats();	//analyze call computeStats
		analyze.displayResults();	//analyze call displayResults
	}

	public void getData() {	//declare public void method named by getData
		System.out.println("Enter number of sales associates:");	//printout Enter number of sales associates:
		Scanner mykeyboard=new Scanner(System.in);	// data can be entered from the keyboard using

		int numberOfAssociate = mykeyboard.nextInt();	//numberOfAssociate can work by using keyboard
		team = new SalesAssociate[numberOfAssociate];	//team equal SalesAsoociate class limited numberOfAssoicate

		for(int i=0; i<numberOfAssociate;i++) {	//if i equal zero and i less than numberOfAssociate, i can increase 1
			System.out.println("Enter data for associate number"+(i+1));	//printout Enter data for associate number i+1
			System.out.print("Enter name of sales associate:");	//printout Enter name of sales associate: 
			mykeyboard.nextLine();	//reads the rest of the current keyboard input line and returns the characters read
			String name = mykeyboard.nextLine();	//name has that reads the rest of the current keyboard input line and returns the characters read
			System.out.print("Enter associate's sales:");	//printout Enter associate's sales:
			double sales= mykeyboard.nextDouble();	//returns the next keyboard input as a value of type double

			team[i]=new SalesAssociate();	//team[i] equal SalesAssociate class
			team[i].Setname(name);	//team[i] call Setname method
			team[i].Setsales(sales);	//team [i] call Setsales method
		}
	}

	public void computeStats() {	//declare public void method named by computeStats
		double sum=0;	//declare double sum is zero
		for(int i=0;i<team.length;i++)	//if i is zero and i less than team.length, i increase 1
		{
			sum=sum+team[i].Getsales();	//sum equal sum plus array team[i]'s Getsales method
		}
		averageSales=sum/team.length;	//averageSales equal sum divide team.lemgth

		double highestSales=0;	//declare double highestSales equal zero
		for(int i=0;i<team.length;i++)	//if i is zero and i less than team.length, i increase 1
		{
			if(highestSales<team[i].Getsales())	//if highestSales less array team[i]'s Getsales method
				highestSales=team[i].Getsales();	//highest equal array team[i]'s Getsales method
		}
		this.highestSales=highestSales;	//this.highestSales call highestSales 
	}

	public void displayResults() {	//declare public void method named by displayResults
		System.out.println("Average sales per associate is $"+ (double)averageSales);	//printout Average sales per associate is $+ (double)averageSales
		System.out.println("The highest sales figure is $"+ (double)highestSales);	//printout The highest sales figure is $+ (double)highestSales


		System.out.println("The following had the highest sales:");	//printout The following had the highest sales:
		for(int i=0;i<team.length;i++)	//if i is zero and i less than tema.length, i increase 1
		{
			if(highestSales==team[i].Getsales()) {	//if highestSales euqal array team[i]'s Getsales method
				System.out.println("Name: "+team[i].Getname());	//printout Name: "+team[i].Getname()
				System.out.println("Sales: $"+team[i].Getsales());	//printout Sales: $"+team[i].Getsales()
				System.out.println("$"+((team[i].Getsales())-(double)averageSales)+" above the average");	//printout difference value of Getsales and averageSales
			}
		}
		for(int i=0;i<team.length;i++)	//if i is zero and i less than tema.length, i increase 1
		{
			if(highestSales!=team[i].Getsales()) {	//if highestSales euqal array team[i]'s Getsales method
				System.out.println("Name: "+team[i].Getname());	//printout Name: "+team[i].Getname()
				System.out.println("Sales: $"+team[i].Getsales());	//printout Sales: $"+team[i].Getsales()
				System.out.println("$"+((double)averageSales-(team[i].Getsales())+" below the average"));	//printout difference value of Getsales and averageSales
			}
		}
	}
}

