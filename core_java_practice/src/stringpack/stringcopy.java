package stringpack;
import java.io.*;
import java.util.Arrays;

public class stringcopy {
    public static void main(String args[]) {
        /*copy of string
        String s1="priyanka";
        String s2="";
        for(int i=0;i<s1.length();i++){
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);

         */
        /* uppercase
        String s1="priyanka";
        String s2="";
        for(int i=0;i<s1.length();i++){
            s2=s2+(char)(s1.charAt(i)-32);
        }
        System.out.println(s2);

         */

        /*
        String s1="PRIYANKA";
        String s2="";
        for(int i=0;i<s1.length();i++){
            s2=s2+(char)(s1.charAt(i)+32);
        }
        System.out.println(s2);

         */


        String s1="iNeuRoN";
        String s2="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>='a'&& s1.charAt(i)<='z'){
                s2=s2+(char)(s1.charAt(i)-32);
            }else{
                s2=s2+(char)(s1.charAt(i)+32);
            }
        }
     System.out.println(s2);


      /*

       /* reverse of string

        String s1="priyanka";
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
        */

        /*reverse word
        String s1="priyanka jain";
        String s2="";
        String s[]=s1.split(" ");
        for(int i=s.length-1;i>=0;i--){
            System.out.print(s[i]+" ");
        }

         */
        //reverse sentence
/*
        String s1 = "priyanka jain";
        String s2 = "";
        String s[] = s1.split(" ");
        // for(int i=s.length-1;i>=0;i--){
        for (String ele : s) {
            for (int i = ele.length() - 1; i >= 0; i--) {
                s2 = s2 + ele.charAt(i);
            }
            s2 = s2 + " ";
        }
        System.out.println(s2);


/*

        /* palindrome
        String s1="goaog";
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");

        }
         */
        /*
        //anagram
        String s1 = "smrut I";
        String s2 = "rutim s";

        String s3="";
        String s4="";

          //to lowercase s1
            for (int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
                s3 = s3 + (char) (s1.charAt(i) + 32);
            }else{
                    s3=s3+s1.charAt(i);
                }
            }

        System.out.println(s3);

        //to lowercase s2
            for(int i=0;i<s2.length();i++){
                if (s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z') {
                  s4 = s4 + (char)(s2.charAt(i)+32);
                }else{
                    s4=s4+s2.charAt(i);
                }
        }

        System.out.println(s4);
            //remove blank spaces
        s3 = s3.replace(" ", "");
        s4 = s4.replace(" ", "");

        System.out.println(s3);
        System.out.println(s4);

        //to char array
        char[] c1 = s3.toCharArray();
        char[] c2 = s4.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            System.out.print(c1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < c2.length; i++) {
            System.out.print(c2[i] + " ");
        }
        //sortings
        Arrays.sort(c1);
        Arrays.sort(c2);

        System.out.println();

        if (Arrays.equals(c1,c2)) {k;,
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }

         */
/*
        String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        s1=s1.replace(" ","");
        char[] ch=s1.toCharArray();

        int[] n=new int[26];
        boolean flag=true;

        for(int i=0;i<ch.length;i++){
            int index=ch[i]-65;
            n[index]++;
        }

        for(int i=0;i<n.length;i++) {
            if (n[i] == 0) {
                System.out.println("not anagram");
                flag = false;
                break;
            }
        }
         if(flag==true){
             System.out.println("anagram");
         }

/*

 */
        }


    }



