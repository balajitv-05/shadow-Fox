package calculator;

import java.util.Scanner;

public class calc {
	static Scanner s =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		double c;
		int n = 0;
		
	
		

		
		do 
		{
		System.out.println("Select the value to be performed: "+'\n'+"\t1.Addition" +'\n'+ "\t2.Subtraction"+'\n'+"\t3.Multiplication"+'\n'+ "\t4.Division" +'\n'+  "\t5.Square Root" +'\n'+  "\t6.Logarithmic" +'\n'+ "\t7.Exponentiation" +'\n'+ "\t8.Temperature conversion"+'\n'+"\t9.Exit");
		
		n = s.nextInt();

		
		switch(n)
		{
		case 1 : 
			double o1 = add();
			System.out.println(o1);
			break;
		case 2:
			double o2 = sub();
			System.out.println(o2);
			break;
		case 3: 
			double o3 = mul();
			System.out.println(o3);
			break;
		case 4 : 
			System.out.println("Enter the two values to be divided: ");
			double a1 = s.nextDouble();
			double b1 = s.nextDouble();
			if(b1 !=0)
				{	
				double o4 = div(a1,b1);
				System.out.println(o4);
				}
			else {
				System.out.println("Divisor must be a positive number and not be a zero '0'");
			}
			break;
		case 5:
			c = s.nextDouble();
			if (c > 0)
			{
			double sq =sqrot(c);
			System.out.println(sq);
			}
			else
			{
			System.out.println("Enter a positive number to take square root");
			}
			break;
		case 6:
			double o6 =log();
			System.out.println(o6);
			break;
			
		case 7:
			double o7 = exponentiation();
			System.out.println(o7);
			break;
		case 8:
			double o5 = temp();
			System.out.println(o5);
			break;
		case 9:
			System.out.println("Exited the program"+'\n'+"Thank You!");
			break;
		default:
			System.out.println("Enter a valid number to perform calculations and conversions ");
			break;
			
		}
		}while (n!=9);
		

	}
	static double add()
	{
		System.out.println("Enter the two values to be added: ");
		double a = s.nextDouble();
		double b = s.nextDouble();
		return a+b;
		
	}
	static double sub()
	{
		System.out.println("Enter the two values to be subtracted: ");
		double a = s.nextDouble();
		double b = s.nextDouble();
		return a-b;
	}
	static double mul()
	{
		System.out.println("Enter the two values to be multiplied: ");
		double a = s.nextDouble();
		double b = s.nextDouble();
		return a*b;
		
	}
	static double div(double a,double b)
	{
		return a/b;
		
	}
	static double sqrot(double a)
	{
		System.out.println("Enter the value to Square Root: ");
		double b=Math.sqrt(a);
		return b;
		
	}
	static double exponentiation()
	{
		System.out.println("Enter the value of base: ");
		double a = s.nextDouble();
		System.out.println("Enter the value of exponent: ");
		double b = s.nextDouble();
		double out = Math.pow(a, b);
		return out;
	}
	
	static double log()
	{
		System.out.println("Enter the number to be calculated in logarithm: ");
		double a = s.nextDouble();
		double out = Math.log(a);
		return out;
	}
	static double ctof()
	{
		System.out.println("Enter the celcius value to be converted");
		double celcius = s.nextDouble();
		System.out.println("1.Celcius to Fahrenheit, 2.Celcius to Kelvin:");
		int n1 =s.nextInt();
		switch(n1)
		{
		case 1:
			double f = (celcius * 9/5 )+32;
			return f;
		case 2:
			double k = celcius + 273.15;
			return k;
			}
		return 0;
		
		}
	static double ftoc()
	{
		System.out.println("Enter the fahrenheit value to be converted: ");
		
		double fahrenheit = s.nextDouble();
		System.out.println("1.Fahrenheit to Celcius, 2.Fahrenheit to Kelvin:");
		int n1 =s.nextInt();
		switch(n1)
		{
		case 1:
			double cout = ((fahrenheit-32)*5/9);
			return cout;
		case 2:
			double k = ((fahrenheit-32)*5/9 + 273.15);
			return k;
			}
		return 0;
		
		
	}

	static double ctok()
	{
		System.out.println("Enter the Kelvin value to be converted: ");
		double Kelvin = s.nextDouble();
		System.out.println("1.Kelvin to Celcius, 2.Kelvin to Fahrenheit:");
		int n1 =s.nextInt();
		switch(n1)
		{
		case 1:
			double C = ((Kelvin-273.15));
			return C;
		case 2:
			double Fau = ((Kelvin-273.15)*9/5 + 32);
			return Fau;
		}
		return 0;	
	}
	static double temp()
	{
		System.out.println("1. Celcius to F or K , 2. Fahrenheit to C or  K , 3.Kelvin to C or F");
		int n1 =s.nextInt();
		switch(n1)
		{
		case 1:
			double o1 = ctof();
			return o1;
		case 2:
			double o2 = ftoc();
			return o2;
		case 3:
			double o3 = ctok();
			return o3;
		}
		return 0;	
	}
	
}
