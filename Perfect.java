package Exercise2;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        double n=s.nextDouble();
        double p;
        p=Math.pow(n,0.5);
        int r=(int)Math.round(p);
        if(r*r==n)
        {
        	System.out.println("Perfect");
        }
        else
        {
        	System.out.println("Not perfect");
        }
	}

}
