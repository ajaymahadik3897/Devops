package AJ;

public class armstrongnumber {
    public static void main(String[]arg){
        int a=153;
        int c,temp,b=0;
        temp=a;

        while(a>0){
            c=a%10; //3,5,1
            a=a/10;  //15,1
            b=b+(c*c*c);
        }
        if (temp==b) {
            System.out.println("armstrong no." +b);
        }
            else{
                System.out.println("Not armstrong " +b);
            }
        }


}

