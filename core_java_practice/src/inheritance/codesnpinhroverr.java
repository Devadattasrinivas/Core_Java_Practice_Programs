package inheritance;
/*
class A{
    public String toString(){
    return null;
    }
}
public class codesnpinhroverr {
    public static void main(String args[]){
        String text=null;
        System.out.println(text);
        text=text+new A();
        System.out.println(text.length());
    }
}

 */
/*
class SpecialString{
    String str;
    SpecialString(String str);
    this.str=str;
}
public class codesnpinhroverr {
    public static void main(String args[]) {
        Object[] arr = new Object[4];
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    arr[i] = new String("java");
                    break;
                case 2:
                    arr[i] = new StringBuilder("java");
                    break;
                case 3:
                    arr[i] = new SpecialString("java");
                    break;
            }
        }
        for (Object obj : arr) {
            System.out.println(obj);
        }
    }
}

 */

/*
public class codesnpinhroverr {
    public static void main(String args[]) {
        String str=" ";//"blankspace" not empty
        boolean b1=str.isBlank();
        System.out.println(b1);
        str.trim();
        b1=str.isEmpty();
        System.out.println(b1);

    }
    }

 */
/*
class myString extends String{
    String name;
}

 */
public class codesnpinhroverr {
    public static void main(String args[]) {
        /*
        String name = "goat hello".substring(2);
        System.out.println(name);
         */
        /*
        String s="1".repeat(5);
        System.out.println(s);
         */
       // System.out.println("1".concat("5").repeat(4));
        /*
        String str="string".replace('s','0');
        System.out.println(str);

         */
       // System.out.println("java"==new String("java"));//scp==heap
      if("string".toUpperCase()=="STRING"){//chane in obj memory allocated in heap==scp
          System.out.println("true");
      }else{
          System.out.println("false");
      }



    }
}