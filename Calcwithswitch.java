
import java.util.Scanner;

public class Calcwithswitch {
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of the given no's is-->"+c);	
	}
	public static void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Substraction of the given no's is-->"+c);	
	}
	public static void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("Multiplication of the given no's is-->"+c);	
	}
	public static void div(int a,int b)
	{
		int c=a/b;
		System.out.println("Division of the given no's is-->"+c);	
	}
	
	
	public static void main(String args[])
	{
		char choice='\0';
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculator has the following funcions\n");
		System.out.println("1)Addition\n2)Substraction\n3)Multiplication\n4)Division");
		System.out.println("\nenter your choice");
		choice=sc.next().charAt(0);
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		
		System.out.println("The 1st no is"+n1);
		System.out.println("The 2nd no is"+n2);
		
		switch(choice)
		{
		case '1':
			add(n1,n2);
			break;
		case '2':
			sub(n1,n2);
			break;
		case '3':
			mul(n1,n2);
			break;
		case '4':
			div(n1,n2);	
			break;
		default:
			System.out.println("enter valid choice");
			
		}
		
	}
	

}
