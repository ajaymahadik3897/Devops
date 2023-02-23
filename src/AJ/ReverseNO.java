package AJ;

public class ReverseNO {
    public static void main(String[]arg){
        int n=11;
        int temp,rem,rev=0;
        temp=n;

        while(n>0){
            rem=n%10;
            n=n/10;
            rev=rev*10+rem;

        }
        System.out.println(rev);
        if (temp==rev) {
            System.out.println("reverse no" +rev);
        }
        else{
            System.out.println("Not rev " +rev);
        }



    }
}
