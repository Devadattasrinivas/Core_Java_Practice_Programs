package stringpack;

public class snip2 {
    /*
    public static void main(String args[]){//main method overloading
       System.out.println("one");
    }
    public static void main(Integer args[]){
        System.out.println("two");

    }
    public static void main(byte args[]){
        System.out.println("three");

    }

     */
    public static void main(String args[]){
        Long x=42L;
        long y=44L;
        System.out.print(" "+7+2+" ");//" " is string if one operator string result of + will be string in entire exp
       System.out.print(foo()+x+5+" ");
        System.out.print(x+y+foo());//first 2 integers so added
       // System.out.println(7+2+" "+x+7+foo());

    }
    static String foo(){
        return "foo";
    }
}
