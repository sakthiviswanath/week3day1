package week3.day1;

public class Calculator {
	
	
	public void add(int a ,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	
	{
		System.out.println(a+b+c);
	}

	
	public void mul(int a ,int b)
	{
		System.out.println(a*b);
	}
	
	
	public void mul(int a, double b)
	
	
	{
		System.out.println(a*b);
	}
	
	
	public void sub(int a,int b)
	
	{
		System.out.println(a-b);
	}
	
	public void sub(double a,double b)
	
	{
		System.out.println(a-b);
	}
	
public void div(int a,int b)
	
	{
		System.out.println(a/b);
	}
	
	public void div(int a,double b)
	
	{
		System.out.println(a/b);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator ob =new Calculator();
		
		
	ob.add(10, 10);
	ob.add(10, 10,10);
	ob.mul(10, 10);
	ob.mul(10, 10.55);
	ob.sub(10, 20);
	ob.sub(20.5, 10);
	ob.div(10, 10);
	ob.div(10, 5.5);
	}

}
