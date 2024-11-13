package com.driver;

public class Main {

   public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();

        //Try setting a value to name by directly accessing it using obj and also try printing it
        // rwOnly.name="Rahul";
        //'name' has private access in 'com.driver.RWOnly'

        rwOnly.setName("Rahul");
        System.out.println(rwOnly.getName());

    }
  
}
