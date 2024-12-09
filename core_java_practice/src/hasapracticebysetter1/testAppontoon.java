package hasapracticebysetter1;
import  hasapracticebysetter.ontoon;
import  hasapracticebysetter.ontoonemp;

public class testAppontoon {
    public static void main(String args[]){
        //inputting the data
        ontoon o=new ontoon();
        o.setAco("id100");
        o.setBranch("madhu");
        /*
        System.out.println(o.getAco());
        System.out.println(o.getBranch());
         */


        ontoonemp o1=new ontoonemp();
        o1.setEid(1);
        o1.setEname("deva");
        o1.setOnto(o);//pass const ref var

        //to display the data
        /*
        System.out.println(o.getAco());
        System.out.println(o.getBranch());
         */
       //print the values by target class ref variables
        System.out.println(o1.getEid());
        System.out.println(o1.getEname());
        System.out.println(o1.getOnto().getAco());
        System.out.println(o1.getOnto().getBranch());









    }
}
