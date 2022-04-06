package Exercise2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Range:");
		int n=s.nextInt();
		int a=0;
		int b=1;
		int c=a+b;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++)
		{
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
		}

	}

}
