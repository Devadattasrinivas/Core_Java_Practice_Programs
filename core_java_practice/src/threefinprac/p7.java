package threefinprac;
import java.util.Arrays;
public class p7 {
    public static void main(String args[]){
        /*
        String s="road";
        System.out.println(s);
        String s1="vijayantimaala";
        String s2="";
        for(int i=0;i<s1.length();i++){
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);

         */

        /*
        //reverse a string
        String s3="reverse";
        String s4="";
        for(int i=s3.length()-1;i>=0;i--){
            s4=s4+s3.charAt(i);
        }
        System.out.println(s4);
         */

        //reverse a word in a sentence
/*
        String s="reverse a sentence";
        String str[]=s.split(" ");
        String se="";//sentence a reverse
        System.out.println(str.length);
       for(int i=str.length-1;i>=0;i--) {
           System.out.print(str[i]+ " ");
       }

 */



       //reverse a word seq of a string in a sentence
        /*
        String q="reverse a word sequence";
        String[] st=q.split(" ");
        String r="";
        for(String e:st){
            for(int i=e.length()-1;i>=0;i--){
                r=r+e.charAt(i);
            }
            r=r+" ";
        }


        System.out.println(r);//esrever a drow ecneuqes

         */


        //lower to upper
        /*
       String s1="oggy";
       String s2="";
        for(int i=0;i<s1.length();i++){
          s2=s2+(char)((int)s1.charAt(i)-32);
        }
        System.out.println(s2);

         */

//upper to lower
        /*
        String o1="OGGY";
        String o2="";
        for(int i=0;i<o1.length();i++){
            o2=o2+(char)(o1.charAt(i)+32);
        }
        System.out.println(o2);

         */

        //copy a string
        /*
        String s1="copy string";
        String s2="";
        for(int i=0;i<s1.length();i++){
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);

         */
/*
   String s1="iNeUrOn";
   String s2="";

    for(int i=0;i<s1.length();i++) {
        if(s1.charAt(i)>='a' && s1.charAt(i)<='z'){
            s2=s2+(char)(s1.charAt(i)-32);

        }
        else{
            s2=s2+(char)(s1.charAt(i)+32);

        }
    }
        System.out.println(s2);

 */
        /*
        String s1="roaori";
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
         if(s1.equals(s2)){
             System.out.println("palindrome");
         }else{
             System.out.println(" not palindrome");

         }

         */

         //anagram
        /*
        String s1="lis Ten";
        String s2="tensI l";

        String h1=s1.replace(" ","");
        String h2=s2.replace(" ","");
        System.out.println(h1);
        System.out.println(h2);


        String w1=h1.toLowerCase();
        String w2=h2.toLowerCase();
        System.out.println(w1);
        System.out.println(w2);


        char[] c1=w1.toCharArray();
        char[] c2=w2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0;i<c1.length;i++){
            System.out.print(c1[i]+" ");
        }
        System.out.println();

        for(int i=0;i<c2.length;i++){
            System.out.print(c2[i]+" ");
        }
        System.out.println();



        //to print anagram or not without using arraysequal method

         if(c1.length==c2.length){
             for(int i=0;i<c1.length;){
                 for(int j=0;j<c2.length;){
                     if(c1[i]==c2[i]){
                         i++;
                         j++;
                     }else{
                        // System.out.println("not anagram");
                         break;
                     }
                 }
                 System.out.println();
                 System.out.println("anagram");
             }
         }

         */

        /*
      if(Arrays.equals(c1,c2)){
          System.out.println("anagram");
      }else{
          System.out.println("not anagram");
      }

 */


        //pangram

        String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String s2=s1.replace(" ","");
        char[] c1=s2.toCharArray();
        for(int i=0;i<c1.length;i++){
            System.out.print(c1[i]+" ");
        }
        int[] r=new int[26];

        for(int i=0;i<c1.length;i++){
            int index=c1[i]-'A';
            r[index]++;
        }
        System.out.println();

        for(int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }
        boolean flag=false;
        for(int i=0;i<r.length;i++) {
            if (r[i] == 0) {
                System.out.println("not pangram");
                flag=true;
                break;
            }
        }
        if ( flag == false) {
            System.out.println(" pangram");
        }


    }
}
