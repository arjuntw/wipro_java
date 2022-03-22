public class calc {
	int c;

	public int add(int a,int b)
	{
		c=a+b;	
		return c;
	}
	public int sub(int a,int b)
	{
		c=a-b;
		return c;
	}
	public int mul(int a,int b)
	{
		c=a*b;
		return c;
	}
	public float div(int a,int b)
	{
		c=a/b;
		return c;
	}
	public int mod(int a,int b)
	{
		c=a%b;
		return c;
	}
	
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		calc obj=new calc();
		System.out.printf("\nthe addition is-->"+obj.add(a,b) );
		System.out.printf("\nthe substraction is-->"+obj.sub(a,b) );
		System.out.printf("\nthe multiplication is-->"+obj.mul(a,b) );
		System.out.printf("\nthe division is-->"+obj.div(a,b) );
		System.out.printf("\nthe remainder is-->"+obj.mod(a,b) );	}
	

}
