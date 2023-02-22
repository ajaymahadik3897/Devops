package AJ;

import java.util.ArrayList;

public class CountOfArray {
    //count the number of names which is starting from A
    public static void main(String[] as) {
        ArrayList<String> A=new ArrayList<String>();
        A.add("AJ");
        A.add("VJ");
        A.add("CJ");
        A.add("AJAY");
        int count=0;


        for(int i=0;i<A.size();i++){

            String b=A.get(i);
            if(b.startsWith("A")){
                count++;
            }

        }
        System.out.println("count is : " + count);


    }



}
