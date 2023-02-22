package OOPS;



public class Casting_primitive {
    //implicit casting
    public static void implicit()
    {
        int a = 10;
        double b = a;
        System.out.println(b);
    }
    //Explicit casting
    public static void Explicit()
    {
        double k = 100.11;
        int j = (int)k;
        System.out.println(j);
    }
  public static void main (String[]stg) {
      implicit();
      Explicit();

  }



}
