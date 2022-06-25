
public class Operaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //Arthametic opperatoes
		System.out.println("******************//arthametic opearator//*****************");
		int a=11,b=10;
		int c=a+b;
		int d=c*b;
		int e=d-c;
		int f=e%a;
		System.out.println(""+c);
		System.out.println(""+d);
		System.out.println(""+e);
		System.out.println(""+f);
		//trineery opprator
		System.out.println("******************//trynery opperator//*****************");
		int x=12;
		x = (10==x)?1:0;
		System.out.println(x);
		System.out.println("******************//nested for loop//*****************");
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
			{
	System.out.println("Value of i:"+i+" and value of j:"+j);
			}
			System.out.println("************************");
		}

	}

}
