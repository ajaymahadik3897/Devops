package OOPS;

public class Inheritance_2 extends Inheritance_1{
  // Child Class
    public static void my(){
        System.out.println("Child class static method");
    }
    public static void main(String[]arg){
        Inheritance_1 ab =new Inheritance_2();
        ab.main();  //From Inheritance1 class
        my();
        main1();   //From Inheritance1 class
    }


}
