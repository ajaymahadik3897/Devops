package AJ;



public class StaticAndNonStatic {

    public void a(){
        System.out.println("Non static Method");

    }
    public static void b(){
        System.out.println("Static method");
    }
        public static void main(String[] args) {

        StaticAndNonStatic ab=new StaticAndNonStatic(); //Create object for non satic method run
        ab.a();
        ab.b();



        }
}
