package AJ;

public class StringA {
    public void A(){        //Splliting the sentence
       String C ="AJAY SANTOSH MAHADIK";
        System.out.println(C);
       String[] Splitting=C.split(" ");
        System.out.println(Splitting[2] +" "+ Splitting[1]+" "+ Splitting[0]); //Reverse sentesnce

        System.out.println(Splitting[0]);
        System.out.println(Splitting[1]);
        System.out.println(Splitting[2]);

    }
    public void B()     //Split word splited in character
    {
        String Q = "Vijay SANTOSH MAHADIK";
        String[] Divide = Q.split(" ");
        String AB = Divide[0];
        for (int i = 0; i < AB.length(); i++)
        {

            System.out.println(AB.charAt(i));
        }

    }
    public static void main(String[]arg)
    {
      StringA object=new StringA();
      object.A();
      System.out.println("**********************************");

      object.B();
      System.out.println("**********************************");
    }


}
