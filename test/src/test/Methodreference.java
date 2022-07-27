package test;
import java.util.function.BiFunction;
public class Methodreference {
  
public static<T> T mergerThings(T a,T b,BiFunction<T,T,T>merger) {
	   return merger.apply(a, b);
   }
   public static String appendString(String a,String b) {
	   return a+b;
   }
   public static String appendString2(String a,String b) {
	   return a+b;
   }
	public static void main(String[] args) {
		Methodreference obj = new Methodreference();
		System.out.println(Methodreference.mergerThings("hello","world", (a,b)->a+b));
		
	}

}
