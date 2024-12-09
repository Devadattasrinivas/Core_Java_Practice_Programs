package minpro;

public class stringd {
    public static void main(String args[]){
        //2 ways to create string obj
        String s1="sachin";//as a direct literal
        String s2=new String("sachin");//as related to oops concept

        s1.concat("tendul");// (String class is immutable) s1 not referencing to existing obj ,new obj created and changes made on it garbage collector collected it  and not collecting into any var
        s2.concat("tendulk");
        System.out.println(s1);
        System.out.println(s2);

        StringBuilder s3=new StringBuilder("gov");//(stringBuilder class mutable changes made on the existing obj
        s3.append("inda");
        System.out.println(s3);
//comparision for string
        System.out.println(s1==s2);//comparing references as it is not pointing to same obj returns false
        System.out.println(s1.equals(s2));//comparing content of obj returns true
//comparision for stringBuilder
        System.out.println(s1==s2);//comparing references as it is not pointing to same obj returns false
        System.out.println(s1.equals(s2));//equals method compares the  references of 2 obj in stringbuilder

    }
}

