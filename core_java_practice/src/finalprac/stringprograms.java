package finalprac;
import java.util.Arrays;
public class stringprograms {
    public static void main(String args[]){

//print a string
        /*
        String s1="devadatta";
        String s2="";
        for(int i=0;i<s1.length();i++){
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
        */

//reverse a string
        /*
        String e1="devadatta chikati";//reverse whole string
        String e2="";
        for(int i=e1.length()-1;i>=0;i--){
            e2=e2+e1.charAt(i);
        }
        System.out.println(e2);
        */

          //reverse a word in a sent
/*
        String r1="prabhakar rao";
        String r2[]=r1.split(" ");
        String r3="";
        for(int i=r2.length-1;i>=0;i--){
            r3=r3+r2[i];
            r3=r3+" ";
        }
        System.out.println(r3);

 */


        //reverse a string in a word seq
        /*

        String h1="harry potter";
        String h2[]=h1.split(" ");
        String h3="";
        for(String ele:h2){
            for(int i=ele.length()-1;i>=0;i--){
                System.out.print(ele.charAt(i));
            }
            System.out.print(" ");
        }
        System.out.println();

         */
/*
        // lower to upper (-32)
        String o1="harry";
        String o2="";
        for(int i=0;i<o1.length();i++){
            o2=o2+(char)(o1.charAt(i)-32);
        }
        System.out.println(o2);

        //upper to lower(+32)
        String u1="HARRY";
        String u2="";
        for(int i=0;i<u1.length();i++){
           u2=u2+(char)(u1.charAt(i)+32);
        }
        System.out.println(u2);

        //copy a string
        String q1="sapota";
        String q2="";
        for(int i=0;i<q1.length();i++){
            q2=q2+q1.charAt(i);
        }
        System.out.println(q2);

        //iNeUrOn
        String y1="iNeUrOn";
        String y2="";
        for(int i=0;i<y1.length();i++){
            if(y1.charAt(i)>='A' && y1.charAt(i)<='Z'){
                y2=y2+(char)(y1.charAt(i)+32);
            }else{
                y2=y2+(char)(y1.charAt(i)-32);
            }
        }
        System.out.println(y2);

        //palindrome
        String a1="roor";
        String a2="";
        for(int i=a1.length()-1;i>=0;i--){
            a2=a2+a1.charAt(i);
        }
       if(a1.equals(a2)){
           System.out.println("palindrome");
       }else{
           System.out.println("not pal");
       }


       //anagrams
        String f1="re aD";
        String f2="dea r";

        String w1=f1.replace(" ","");
        String w2=f2.replace(" ","");

        String j1="";
        String j2="";

        for(int i=0;i<w1.length();i++){
            if(w1.charAt(i)>='A' && w1.charAt(i)<='Z'){
                j1=j1+(char)(w1.charAt(i)+32);
            }else{
                j1=j1+w1.charAt(i);
            }
        }
        System.out.println(j1);


        for(int i=0;i<w2.length();i++){
            if(w2.charAt(i)>='A' && w2.charAt(i)<='Z'){
                j2=j2+(char)(w2.charAt(i)+32);
            }else{
                j2=j2+w2.charAt(i);
            }
        }
        System.out.println(j2);


        char[] c1=j1.toCharArray();//array
        char[] c2=j2.toCharArray();
      // Arrays.sort(c1);
       //Arrays.sort(c2);
        if(c1.length!=c2.length){
            System.out.println("not anagram");
        }else{
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1,c2)) {
                System.out.println("anagram");
            }else{
                System.out.println("not anagram");
            }

        }
*/

        //pangram(subtract 'A' for uppercase ,'a' for lowercase)
    String t1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG" ;
    String t2=t1.replace(" ","");
    char[] ch=t2.toCharArray();
    int[] r=new int[26];
    boolean flag=false;
    for(int i=0;i<=ch.length-1;i++){
        int index=ch[i]-'A';//int index=ch[i]-65;
      //  System.out.print(index+" ");
        r[index]++;
        //System.out.println();
        //System.out.print(r[index]+" ");

    }
     for(int i=0;i<r.length;i++){
         //System.out.println(r[i]);
         if(r[i]==0){
             System.out.println("not pangram");
             flag=true;
         }
     }

     if(flag==false){
     System.out.println("pangram");
     }

    }
}
