package com.svkp;

public class Myeceptiondemo extends Exception {
  
  private static final Exception ex = null;
private static int accno[]= {101,102,103,104,105};
  private static String name[]= {"ram","surya","phani","krishna","sri"};
  private static double bal[] = {1000.22,300000.89,7896.88,67.88,765.99};
  Myeceptiondemo(String s)
  {
	  super( );
  } 
	public static void main(String[] args) {
		try {
			  System.out.printf(accno + "\t", name + "\t",bal + "\t");
			  for(int i=0;i<=5;i++)
		     	{
			       System.out.printf(accno[i] + "\t", name[i] + "\t",bal[i] + "\t");
			     if(bal[i]<1000){
			    	 Myeceptiondemo ex=new Myeceptiondemo("");
			    	 throw ex;
			     }
		     	}
	     	}
		 catch(Exception e)
		{
			 e.printStackTrace();
		}
	}

}
