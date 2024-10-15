package Slip17;


	import java.io.*;
	class Mynumber1
	{
		 int a;
		Mynumber1()
		{
			a=0;
		}
		Mynumber1(int a)
		{
			this.a=a;
		}
		boolean ispositive(int a)
		{
			if(a>0)
			return true;
			else
			return false;
		}
		boolean isnegative(int a)
		{
			if(a<0)
			return true;
			else
			return false;	
		}
		boolean iseven(int a)
		{
			if(a%2==0)
			return true;
			else
			return false;
		}
		boolean isodd(int a)
		{
			if(a%2!=0)
			return true;
			else
			return false;
		}
		boolean iszero(int a)
		{
			if(a==0)
			return true;
			else
			return false;
		}
	}

	class Mynumber
	{
		public static void main(String args[]) throws IOException
		{
			int a=Integer.parseInt(args[0]);
			Mynumber1 m=new Mynumber1();
			if(m.isodd(a))
			System.out.println("Odd");
			if(m.iseven(a))
			System.out.println("Even");
			if(m.ispositive(a))
			System.out.println("Positive");
			if(m.isnegative(a))
			System.out.println("Negative");
			if(m.iszero(a))
			System.out.println("Zero");
		}
	}



