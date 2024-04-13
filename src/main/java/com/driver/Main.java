package com.driver;
import java.util.*;

public class Main {
 public class A{
   public String meth(){
     return "Invoking method from class A";
   }

 }

 public class B extends A{
   @Override
   public String meth() {
     return "Method is overridden in Extendend class B";
   }
 }

 B b1 = new B();
 String s = b1.meth();
}