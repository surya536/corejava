import java.util.Random;
public class RandomNumbers {

	public static void main(String[] args) {
       int a,b;
       Random random = new Random();
       a = random.nextInt(50);
       b = random.nextInt(1000);
       System.out.println("");
       System.out.println(a);
       System.out.println(b);
	}

}
