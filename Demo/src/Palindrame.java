import java.util.Scanner;
public class Palindrame {
       
	public static void main(String[] args) {
	  */updating rows */
        String a,b;
        StringBuffer sb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it is a palindrame: ");
        a=sc.nextLine();
        sb= new StringBuffer(a);
        b=sb.reverse().toString();
        
        if(a.equals(b))
        {
        	System.out.println("yes");
        }
        
        	else
        	{
        		System.out.println("no");
        	}
	}
}
	
