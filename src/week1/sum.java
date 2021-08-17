package week1;

import java.util.Scanner;

public class sum {
	int Tong(int n)
	{
		int s = 0;
		for (int i = 0; i<=n; i++ )
			s= s + i;
		return s;
	}
	
	int factorial(int n)
	{
		int f = 1;
		for (int i=1; i<=n; i++)
			f=f*i;
		return f;
	}
	
	int Fact(int n)
	{
		if (n==0)
			return 1;
		else
			return n* Fact(n-1);
	}
	
	int fibonacci (int n)
	{
		if (n<=2)
			return n;
		else return fibonacci(n-1) + fibonacci(n-2);
	}
	
	void inFib (int n)
	{
		System.out.print("1 ");
		for(int i =1; i<=n; i++)
			System.out.print(fibonacci(i) + " ");
	}
	
	double TongN(int n)
	{
		double s = 0;
		for(int i=1; i<=n; i++)
			s = s + 1.0/(1*i);
		return s;
		
	}
	
	boolean isPrime(int x) //ktra x co phai prime
	{
		for (int i = 2; i<=x; i++)
		if( x%i == 0)
			return false;
		return true;
		
	}
	
	void InPrime(int n) //In cac prime tu 1-n
	{
		
        for (int x= 2;x<=n;x++) 
        {
        	if(isPrime(x)) 
        	{
        		System.out.println(x);
        	}
        }
	}
	
	
	public static void main(String[] arg) 
	{
		
		sum S = new sum();
		System.out.println("Nhap so nguyen to bat ki");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Day so nguyen to tu 1 den n: ");
		S.InPrime(n);
			
		
	}
	
	
}
