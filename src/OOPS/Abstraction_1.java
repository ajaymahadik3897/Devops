package OOPS;
 abstract class Abstraction_1 {
//we can use static and non-static method in abstract class
//Complete and incomplete method we can use in this
//we cannot create object of abstract class
 abstract public void incomplete();
 public static void complete (){
     System.out.println("completed method");
 }

 public static void main(String[]arg){
     complete();
 }
 }