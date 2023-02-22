package AJ;

public class FibbonicSeries {
    public static void main(String[]avg){
        int n1=0,n2=1,n3,i;

        System.out.println(n1 + "" +n2);
        for( i=2;i<=10;i++) {
            n3 = n1 + n2;
            System.out.println("" +n3);
            n1 = n2;
            n2 = n3;
        }


    }
}
