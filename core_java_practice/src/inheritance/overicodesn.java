package inheritance;

public class overicodesn {
    public static void main(String args[]){
        /*
        for(int i=5;i>=1;i--){
            System.out.println("*".repeat(i));
        }
         */
        /*
        String opt="True";
        switch(opt){
            case "True":
                System.out.print("True");
                break;
            default:
                System.out.println("*****");
        }
        System.out.print("Done");
         */
/*//shouldnt be boolean switch case condition
        boolean opt=true;
        switch(opt){
            case true:
                System.out.print("True");
                break;
            default:
                System.out.println("*****");
        }
        System.out.print("Done");

 */
        /*
        int x=5;
        while(isAvailable(x)){
            System.out.println(x);
            x--;
        }

    }
    public static boolean isAvailable(int x){
       if((x)>0){
           return true;
        }else{
           return false;
       }

         */
/*
        StringBuilder sb=new StringBuilder();
        String s="";
        if(sb.equals(s)){
            System.out.println("Match 1");
        }else if(sb.toString().equals(s.toString())) {
            System.out.println("Match 2");
        }
        else{
            System.out.println("Match 3");
        }
 */
        /*
        String text="Rise";
        text=text+(text="Above");
        System.out.println(text);
         */
/*
        StringBuilder sb=new StringBuilder();
        String s1=sb.toString();
        String s2=sb.toString();
        System.out.println(s1==s2);

 */


        /*
        String str="java";
        StringBuilder sb=new StringBuilder("java");
        System.out.println(str.equals(sb)+":"+sb.equals(str));

         */
/*
       String str="ICICINBRB$$";
       System.out.println(str.substring(4,6));

 */
        /*
        StringBuilder sb=new StringBuilder();
         System.out.println(sb.append(null).length());

         */

        /*
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.append("").append("").append("").append("").length());

         */
/*
        StringBuilder sb=new StringBuilder();
        sb.append("0123456789");
        sb.delete(8,1000);
        System.out.println(sb);

 */
        /*
        StringBuilder sb=new StringBuilder("hurray passed");
        sb.delete(0,100);
        System.out.println(sb);

         */
        /*
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.length()+":"+sb.toString().length());
         */

    }
}
