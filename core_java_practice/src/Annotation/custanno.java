package Annotation;
import java.lang.annotation.*;
//enums can be used in switch case
//type,runtime in capitalsize they too are enums
@Target(ElementType.TYPE)//type means can be applied to class,interface,constructor,parameter
@Retention(RetentionPolicy.RUNTIME)//if chosen  source just like comment
@interface  CricketPlayer{
    //if no value-marker,single value-single value anno..,here two values so multi-valued anot..
    //2ways to give values to those multi valued annota..

    //String country() default "INDIA";//first way to assign values
    //int runs() default 3000;//default a syntax not accesss modifier
    String country();
    int runs();
}
//target:to apply where(for eg if interface annotation should be applied to interface only
//retention policy : upto where the power should be like till jvm,compiler etc
@CricketPlayer(country="india",runs=3000)//passing values to annotations depend on requiremnt not compulsory
class viratkohli{
    private int innings;
    private String name;
    public void setInnings(int innings){
        this.innings=innings;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getInnings(){
        return innings;
    }
    public String getName(){
        return name;
    }
}
public class custanno {
    public static void main(String[] args) {
     viratkohli vk=new viratkohli();
     vk.setInnings(300);
     vk.setName("era");
     System.out.println(vk.getInnings());
     System.out.println(vk.getName());
     Class c=vk.getClass();//to get the annotation
     //System.out.println(c);
     Annotation a1=c.getAnnotation(CricketPlayer.class);//to get the values of annotation(.class after annotation to be used)
     //System.out.println(a1);
      CricketPlayer z=(CricketPlayer) a1; //(downcasting)we want that to our anno.. type (to convert into cricke..annotation type
        int s=z.runs();
       String s1=z.country();
       System.out.println(s);
       System.out.println(s1);



    }
}
