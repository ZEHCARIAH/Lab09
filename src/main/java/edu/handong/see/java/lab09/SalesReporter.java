package edu.handong.see.java.lab09;

import java.util.Scanner;
import java.util.ArrayList;

public class SalesReporter {	//declare public class

	private double highestSales;	//declare private double member
	private double averageSales;	//declare private double member
	private ArrayList<SalesAssociate>team=new ArrayList<SalesAssociate>();	//declare private array member


	public static void main(String[] args) {	//declare public void main method

		SalesReporter analyze = new SalesReporter();	//SalesReporter declare analyze and has same function by using new
		analyze.getData();	//analyze call getData
		analyze.computeStats();	//analyze call computeStats
		analyze.displayResults();	//analyze call displayResults
	}

	public void getData() {	//declare public void method named by getData
		Scanner mykeyboard=new Scanner(System.in);	// data can be entered from the keyboard using
		int i=0;
		boolean done=false;

		while(!done) {

			System.out.println("Enter data for associate number"+(i));
			i++;
			System.out.print("Enter name of sales associate:");	//printout Enter name of sales associate: 
			mykeyboard.nextLine();	//reads the rest of the current keyboard input line and returns the characters read
			String name = mykeyboard.nextLine();
			SalesAssociate s= new SalesAssociate();
			team.add(s);
			s.Setname(name);
			System.out.print("Enter associate's sales:");	//printout Enter associate's sales:
			double sales= mykeyboard.nextDouble();	//returns the next keyboard input as a value of type double
			s.Setsales(sales);			
			System.out.print ("More items for the list? ");
			  String ans = mykeyboard.nextLine ();
	            if (!ans.equalsIgnoreCase ("yes"))
	                done = true;
		}
	}

	public void computeStats() {	//declare public void method named by computeStats
		double sum=0;	//declare double sum is zero
		for(SalesAssociate s:team)	//if i is zero and i less than team.length, i increase 1
		{
			sum=sum+s.Getsales();	//sum equal sum plus array team[i]'s Getsales method
		}
		averageSales=sum/team.size();	//averageSales equal sum divide team.lemgth

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
