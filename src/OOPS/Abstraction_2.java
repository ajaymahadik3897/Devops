package OOPS;

public class Abstraction_2 extends Abstraction_1{
//concrete class-we can run abstract class method in this class.
//we can create object in concrete class.
     public void incomplete()
     {
         System.out.println("incomplete method is completed");
     }
    public static void main (String[]stg){
         complete();
         Abstraction_2 ab=new Abstraction_2();
         ab.incomplete();


    }



}
