import java.util.*;

class Calculator
{
	public int add(int a,int b)
	{
		return a+b;		
	}
	public int sub(int a,int b)
	{
		return a-b;		
	}
	public int mul(int a,int b)
	{
		return a*b;		
	}
	public int div(int a,int b)
	{
		return a/b;		
	}
}
public class Desgin_Project
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Calculator cal=new Calculator();
		System.out.println("Enter one of the options:\n1=>addition\n2=>substraction\n3=>multiplication\n4=>division\n");
		int opt=sc.nextInt();
		int res;
		if(opt<=0 || opt>=5)
			System.out.println("Enter valid option");
		else
		{
		System.out.println("Enter the operand1");
		int a=sc.nextInt();
		System.out.println("Enter the operand2");
		int b=sc.nextInt();
		switch(opt)
		{
		case 1: 	res=cal.add(a,b);
					System.out.print("Addition of "+a+" and "+b+" = "+res);
					break;
		case 2:		res=cal.sub(a,b);
					System.out.print("Substraction of "+a+" and "+b+" = "+res);
					break;
		case 3:		res=cal.mul(a,b);
					System.out.print("Multiplication of "+a+" and "+b+" = "+res);
					break;
		case 4:		res=cal.div(a,b);
					System.out.print("Division of "+a+" and "+b+" = "+res);
					break;
			}
		}
		sc.close();
	}
}
