package Exercise2;
import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=n*n;
		int rem;
		rem=r%10;
		if(n==rem)
		{
			System.out.println("Automorphic");
		}
		else
		{
			System.out.println("Not");
		}
		

	}

}
