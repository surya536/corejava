import java.util.Scanner;
public class marks {

	public static void main(String[] args) {
	  int i;
	  System.out.println("Enter the marks: ");
	  Scanner sc= new Scanner(System.in);
	  i=sc.nextInt();
	  if(i<50)
	  {
		  System.out.println("F(fail)");
	  }
	  else if(i>=50 && i<60)
	  {
		  System.out.println("D");
	  }
	  else if(i>=60 && i<70) {
		  System.out.println("C");
	  }
	  else if(i>=70 && i<80) {
		  System.out.println("B");
	  }
	  else if(i>=80 && i<90) {
		  System.out.println("A");
	  }
	  else if(i>=90 && i<100) {
		  System.out.println("O");
	  }
	  else {
		  System.out.println("invalid");
	  }
	  
	}
}
