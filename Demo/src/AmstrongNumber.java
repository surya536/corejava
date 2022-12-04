import java.util.Scanner;
public class AmstrongNumber {

	public static void main(String[] args) {
	    int temp,sum,num;
	    int i=1,n=0;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("number:");
	    num = sc.nextInt();
	    i = num;
	    sum = 0;
	    while(num>0){
	    	n=num%10;
	    	num = num/10;
	    	sum = sum+(n*n*n);
	    }
	    if(sum == i) {
	    	System.out.println("yes");
	    }
	    else {
	    	System.out.println("no");
	    }
	}
}
