package AJ;

public class ReverseString {
    public static void main(String[] args) {
        String Name="Ajay";
        System.out.println("Given name is:"+Name);
        String Reverse="";


        for(int i=Name.length()-1;i>=0;i--) {
            Reverse=Reverse+Name.charAt(i)  ;  //CharAt use for Select charcters in given String

        }System.out.println("Reverse name is:"+Reverse);
        int ln=Name.length();
        System.out.println(ln);
    }
}
