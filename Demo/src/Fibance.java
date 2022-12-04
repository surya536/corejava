import java.util.Scanner;
public class Fibance {

	public static void main(String[] args) {
		int a=0,b=1,r;
		int u;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		u=sc.nextInt();
		while(true) {
			r=a+b;
			count++;
			if(r>=u) {
				break;
			}
			a=b;
			b=r;
			System.out.println("["+count+"]->"+r);
			
		}
		

	}

}
