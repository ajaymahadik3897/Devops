package AJ;

public class This {

    String AB="aaa";
         String B;

    public void sample(String AB){
        System.out.println(this.AB);  //First AB

          B=AB;  //Second Ab inside the method argument.
        System.out.println(""+B);

    }

    public static void main(String[]kk){
        This n=new This();
        n.sample("10");
    }


}
