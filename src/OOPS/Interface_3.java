package OOPS;

public class Interface_3 implements Interface_1,Interface_2 {
    //we can apply multilevel inheritance in Implements class

    public void incomplete1() {
        System.out.println("Interface 1 running");
    }
    public void incomplete2() {
        System.out.println("Interface 2 running");
    }
    public static void main(String[]arg){
        Interface_3 ab=new Interface_3();
        ab.incomplete1();
        ab.incomplete2();


    }

}
