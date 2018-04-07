package edu.handong.see.java.lab09;
/**
 * This class declare using members and use SalesReporter class</br>
 * This class has public method and void method</br>
 * Public method has double and string variable.
 * 
 * @author MG
 *
 */

public class SalesAssociate {
	
		private String name;
		private double sales;

		public String Getname()
		{
			return name;
		}

		public double Getsales() {
			return sales;
		}
		public void Setname(String name)
		{
			this.name=name;
		}
		public void Setsales(double sales)
		{
			this.sales=sales;
		}
	}

