package Exercise2;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i!=0)
			{
				System.out.println("prime");
				break;
			}
			else
			{
				System.out.println("Not Prime");
				break;
			}
		}
         
	}

}
