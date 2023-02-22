package AJ;

import java.util.Arrays;
import java.util.Collections;

public class Array {
        public void int_array(){
           int[]numb={10,20,5,6,25,30,25};

           Arrays.sort(numb);  //Sorting the number
            for(int i=0;i<numb.length;i++)
            {
                System.out.println(numb[i]);
            }

        }
    public void String_array(){
        String[]arr={"kj" , "aj", "zz","aa"};

        Arrays.sort(arr);  //ascending sorting                if we want descending oredr then use= Arrays.sort(arr,Collections.reverseOrder());

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
  //OR     // System.out.println(Arrays.toString(arr));        ---without for loop we can run the array .


        System.out.println("--------------------------------***-----------------------------------------");

         //Descending Sorting
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[]Arg){
       Array ab=new Array();
       ab.int_array();
       ab.String_array();
    }
}
