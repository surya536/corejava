package com.svkp.lamidaexpresions;

public class SupplierDemo 
{
 public static void main(String[] args)
 {
  Supplier<Double> randomNumberSupplier = () -> new Random(10).nextDouble();
  System.out.println(randomNumberSupplier.get());
  System.out.println(randomNumberSupplier.get());
 }
}


