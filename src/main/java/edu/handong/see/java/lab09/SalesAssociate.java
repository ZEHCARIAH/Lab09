package edu.handong.see.java.lab09;
/**
 * This class declare using members and use SalesReporter class
 * This class has public method and void method
 * Public method has double and string variable.
 * @author MG
 *
 */

public class SalesAssociate {	// declare public class 
	
		private String name;	//declare private String named by name
		private double sales;	//declare private double named by sales

		public String Getname()	//declare public method
		{
			return name;	//return name
		}

		public double Getsales() {	//declare public method
			return sales;	//return sales
		}
		public void Setname(String name)	//declare public void method
		{
			this.name=name;	//this.name call name 
		}
		public void Setsales(double sales)	//declare public void method
		{
			this.sales=sales; //this.sales call sales
		}
	}

