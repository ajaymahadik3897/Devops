package AJ;

public class Constructors {

    Constructors(){
        System.out.println("First Constructor");
    }
    Constructors(int a){
        System.out.println(a);

    }
    public static void main(String[]arg){
       //new Constructors();
      // new Constructors(10);
      //  or
        Constructors ab=new Constructors();
        Constructors b=new Constructors(10);

        System.out.println();



    }
}
