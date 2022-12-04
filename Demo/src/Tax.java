import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
        int a,b,n;
        int i=350;
        int c=700;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the amount");
        n=sc.nextInt();
        if(n>=25000 && n<=50000)
        {
        	a=n-i;
        	System.out.println(""+a);
        }
        else if(n>=50000 && n<=100000)
        {
        	b=n-c;
        	System.out.println(""+b);
        }
        else {
        	System.out.println("end");
        }
  	}

}
