package edu.handong.see.java.lab09;

import java.util.Scanner;

public class SalesReporter {

	private double highestSales;
	private double averageSales;
	private SalesAssociate[] team;
	private int numberOfAssociate;

	public static void main(String[] args) {

		SalesReporter analyze = new SalesReporter();
		analyze.getData();
		analyze.computeStats();
		analyze.displayResults();
	}

	public void getData() {
		System.out.println("Enter number of sales associates:");
		Scanner mykeyboard=new Scanner(System.in);

		int numberOfAssociate = mykeyboard.nextInt();
		team = new SalesAssociate[numberOfAssociate];

		for(int i=0; i<numberOfAssociate;i++) {
			System.out.println("Enter data for associate number"+(i+1));
			System.out.print("Enter name of sales associate:");
			mykeyboard.nextLine();
			String name = mykeyboard.nextLine();
			System.out.print("Enter associate's sales:");
			double sales= mykeyboard.nextDouble();

			team[i]=new SalesAssociate();
			team[i].Setname(name);
			team[i].Setsales(sales);	
		}
	}

	public void computeStats() {
		double sum=0;
		for(int i=0;i<team.length;i++)
		{
			sum=sum+team[i].Getsales();
		}
		averageSales=sum/team.length;

		double highestSales=0;
		for(int i=0;i<team.length;i++)
		{
			if(highestSales<team[i].Getsales())
				highestSales=team[i].Getsales();
		}
		this.highestSales=highestSales;
	}

	public void displayResults() {
		System.out.println("Average sales per associate is $"+ (double)averageSales);
		System.out.println("The highest sales figure is $"+ (double)highestSales);


		System.out.println("The following had the highest sales:");
		for(int i=0;i<team.length;i++)
		{
			if(highestSales==team[i].Getsales()) {
				System.out.println("Name: "+team[i].Getname());
				System.out.println("Sales: $"+team[i].Getsales());
				System.out.println("$"+((team[i].Getsales())-(double)averageSales)+" above the average");
			}
		}
		for(int i=0;i<team.length;i++)
		{
			if(highestSales!=team[i].Getsales()) {
				System.out.println("Name: "+team[i].Getname());
				System.out.println("Sales: $"+team[i].Getsales());
				System.out.println("$"+((double)averageSales-(team[i].Getsales())+" below the average"));
			}
		}
	}
}

