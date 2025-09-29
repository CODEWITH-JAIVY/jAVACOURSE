package com.day01interphaseinlambada;


 interface parent {
    void say() ;
  default void sayHello(){
      System.out.println("Hello ");
  }

}
 public class childs implements parent {

     @Override
     public void say() {

     }

     @Override
     public void sayHello() {
         parent.super.sayHello();
     }
 }
