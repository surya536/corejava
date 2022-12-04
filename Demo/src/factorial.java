import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		int n ,cn,fact;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		n=sc.nextInt();
		System.out.println("numbe"+n+":" );
		System.out.println("n:Fact");
		for(int i = 1;i<=n;i++) {
			cn=i;
			fact=1;
			for(int j=1;j<=cn;j++) {
				fact =fact*j;
			}
			System.out.printf("%5d  : %d\n",+cn,+fact);
			
			
		}
		
		
	}

}
