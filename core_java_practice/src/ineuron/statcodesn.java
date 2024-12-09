package ineuron;

public class statcodesn {
    public static void main(String args[]) {
        /*
        byte var=100;
        switch(var){
            case 100:
                System.out.println(100);
                break;
            case 200://byte range exceeded
                System.out.println(200);
                break;
            case 300:
                System.out.println(300);
                break;
            default:
                System.out.println("in default");
        }
         */

        /*
        String fruit=new String(new char[]{'M','A','N','G','O'});
        switch(fruit){
            default:
                System.out.println("any fruit will do");
            case "APPLE":
                System.out.println("apple");
            case "MANGO":
                System.out.println("mango");
            case "BANANA":
                System.out.println("banana");
                break;
        }
         */
        /* args passed at runtime
        boolean flag=!true;
        System.out.println(!flag?args[0]:args[1]);
         */

        /*
        int a=3;//4
        System.out.println(a++==3 || (--a==3 && --a==3));//3==3(4)
        System.out.println(a);
        System.out.println((--a==3 && --a==3));
        System.out.println(a);
         */

        /*
        int a = 3;
        m(++a, a++);
        System.out.println(a);

       }
        public static void m(int i,int j){//local var deleted from stack
            i++;
            j--;
        }
         */

        /*
     boolean flag=false;
     System.out.println((flag=true)|(flag=false)||(flag=true));
        System.out.println(flag);
         */

/*
        boolean status=false;
        System.out.println(status=false|| status=true | status=false);
        System.out.pr

 */

        /*
        String msg="hello";
        boolean[] flag=new  boolean[1];
        if(flag[0]){
            msg="welcome";
        }
        System.out.println(msg);
         */

        /*
        boolean flag1=true;
        boolean flag2=false;
        boolean flag3=true;
        boolean flag4=false;
        System.out.println(!flag1==flag2!=flag3!=flag4);
        System.out.println(flag1=flag2!=flag3==!flag4);
         */

        //   System.out.println(10<20<30);//10<20(true<30)operation btw relational operands false

        int x=10;
        if(false)
            System.out.println(x);//no unreachable statement in ifelse only in loops
        System.out.println("hello");


    }
}
