package com.svkp.demo;

public class Demothis {
       int id;
       String name;
       public Demothis(int id,String name) {
    	   this.id=id;
    	   this.name=name;
       }
       void display(){
    	   System.out.println(id+""+name);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demothis obj = new Demothis(101,"surya");
        obj.display();
        
	}

}
