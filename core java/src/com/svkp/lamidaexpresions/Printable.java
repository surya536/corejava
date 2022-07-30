package com.svkp.lamidaexpresions;
@FunctionalInterface
public interface Printable {
   public void print(String str);
   default void formate(String str) {
	   System.out.print("Formitting string str......");
}

}
