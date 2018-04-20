package edu.handong.see.java.lab09;

import java.util.Scanner;	//import Scanner function
import java.util.ArrayList;	//import ArrayList function

public class SalesReporter {	//declare public class

	private double highestSales;	//declare private double member
	private double averageSales;	//declare private double member
	private ArrayList<SalesAssociate>team=new ArrayList<SalesAssociate>();	//declare ArrayList and its type is SalesAssociate and declare ArrayList;


	public static void main(String[] args) {	//declare public void main method

		SalesReporter analyze = new SalesReporter();	//SalesReporter declare analyze and has same function by using new
		analyze.getData();	//analyze call getData
		analyze.computeStats();	//analyze call computeStats
		analyze.displayResults();	//analyze call displayResults
	}

	public void getData() {	//declare public void method named by getData
		Scanner mykeyboard=new Scanner(System.in);	// data can be entered from the keyboard using
		int i=1	//declare i has 1
				;
		boolean done=false;	//declare boolean value named done eqaul false

		while(!done) {	//if done does not equal 

			System.out.println("Enter data for associate number"+(i));	//printout(Enter data for associate number"+(i))
			i++;	//increase 1
			System.out.print("Enter name of sales associate:");	//printout Enter name of sales associate: 
			String name = mykeyboard.nextLine();	//name can type by using keyboard
			SalesAssociate s= new SalesAssociate();	//Arraylist's salesAsoociate value equal s 
			team.add(s);	//team add SalesAssoicate s
			s.Setname(name);	//s has name function
			System.out.print("Enter associate's sales:");	//printout Enter associate's sales:
			double sales= mykeyboard.nextDouble();	//returns the next keyboard input as a value of type double
			s.Setsales(sales);	//s has sales function
			System.out.print ("More items for the list? ");	//printout More items for the list?
			String ans = mykeyboard.nextLine ();	//ans can type by using keyboard and go next
			mykeyboard.nextLine();	//keyboard go next line
			if (!ans.equalsIgnoreCase ("yes"))	//if ans is not "yes"comment, it can process
				done = true;	//boole done is eaul ture
		}
	}

	public void computeStats() {	//declare public void method named by computeStats
		double sum=0;	//declare double sum is zero
		for(SalesAssociate s:team)	//s has team limit 
		{
			sum=sum+s.Getsales();	//sum equal sum plus s class's GetSales method
		}
		averageSales=sum/team.size();	//averageSales equal sum divide team.size

		double highestSales=0;	//declare double highestSales equal zero
		for(SalesAssociate s:team)	//s has team limit 
		{
			if(highestSales<s.Getsales())	//if highestSales less  s.Getsales method
				highestSales=s.Getsales();	//highest equal s.Getsales method
		}
		this.highestSales=highestSales;	//this.highestSales call highestSales 
	}

	public void displayResults() {	//declare public void method named by displayResults
		System.out.println("Average sales per associate is $"+ (double)averageSales);	//printout Average sales per associate is $+ (double)averageSales
		System.out.println("The highest sales figure is $"+ (double)highestSales);	//printout The highest sales figure is $+ (double)highestSales


		System.out.println("The following had the highest sales:");	//printout The following had the highest sales:
		for(SalesAssociate s: team)	//s has team limit 
		{
			if(highestSales==s.Getsales()) {	//if highestSales equal s.GetSales()
				System.out.println("Name: "+s.Getname());	//printout Name: "+s.Getname()
				System.out.println("Sales: $"+s.Getsales());	//printout Sales: $"+s.Getsales()
				System.out.println("$"+((s.Getsales())-(double)averageSales)+" above the average");	//printout difference value of Getsales and averageSales
			}
		}
		for(SalesAssociate s: team)	//s has team limit 
		{
			if(highestSales!=s.Getsales()) {	//if highestSales equal s.GetSales()
				System.out.println("Name: "+s.Getname());	//printout Name: "+s.Getname()
				System.out.println("Sales: $"+s.Getsales());	//printout Sales: $"+s.Getsales()
				System.out.println("$"+((double)averageSales-(s.Getsales())+" below the average"));	//printout difference value of Getsales and averageSales
			}
		}
	}
}
