package Annotation;
import java.util.*;
class Par{
    public void qwe(){
        System.out.println("qwe");
    }
}
class wer extends Par{
    @Override
    public void qwe(){
        System.out.println("overrided");
    }
}
public class annotationsprac {
    public static void main(String[] args) {
        wer w=new wer();
        w.qwe();
    }
}
