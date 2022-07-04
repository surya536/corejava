package com.svkp.demo;
import java.util.Scanner;
public class Atm {
  
	public static void main(String[] args) {
         int balance = 1000000,withdraw,deposit;
         Scanner sc= new Scanner(System.in);
         while(true)
         {
        	 System.out.println("automated teller mechine");
        	 System.out.println("choice 1 withdraw");
        	 System.out.println("choice 2 diposit");
        	 System.out.println("choice 3 for check balance");
        	 System.out.println("choice 4 exit");
        	 System.out.println("Choice the operation you want to perform");
        	 int choice = sc.nextInt();  
             switch(choice)
             {
             case 1:  System.out.println("ener your amount for withdraw");
                       withdraw = sc.nextInt(); 
                       if(balance >= withdraw)  
                       {  
                          balance = balance - withdraw;  
                          System.out.println("Please collect your money");  
                        }  
                        else  
                         {  
                         System.out.println("Insufficient Balance");  
                         }  
                         System.out.println("");  
                         break;  
        
            case 2:   System.out.print("Enter money to be deposited:");  
                       deposit = sc.nextInt();  
                       balance = balance + deposit;  
                       System.out.println("Your Money has been successfully depsited");  
                       System.out.println("");  
                       break;  
        
             case 3:   System.out.println("Balance : "+balance);  
                       System.out.println("");  
                       break;  
             case 4:   System.exit(0); 
             }
        	 
        	 
         }
         

	}

}
