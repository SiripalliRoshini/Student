package Exercise2;
import java.util.Scanner;
import java.lang.Math;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=n;
		int rem;
		int rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev+rem*rem*rem;
			n=n/10;
		}
		if(k==rev)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not a Armstrong");
		}
		
	}

}
