package stringpack;
 class Student{
     String na="devadatta";
     int id=10;
}
public class stringMethods {
    public static void main(String args[]){
        Student s=new Student();
        System.out.println(s);
        System.out.println(s.toString());//when we print any ref,jvm will call toString() on ref


        String s1=new String("dhoni");
        System.out.println(s1);
        System.out.println(s1.toString());

        String name="hello ";
        String name2="govinda";
        String name3="namam";
        String name4="float";
        String name5="hyderAbbas";
        String name6="FLOAT";
        System.out.println(name.charAt(3));
        System.out.println(name.concat(" deva"));
        System.out.println(name.concat(name2));
        System.out.println(name.equals("devadatta"));//only obj should be passed
        System.out.println(name.equals("hello"));
        System.out.println(name.equals("hello"));
        System.out.println(name.equalsIgnoreCase(name6));//obj and  stringname can be passed in arg as input
        System.out.println(name.equalsIgnoreCase("Hello "));
        System.out.println(name2.substring(2));
        System.out.println(name.substring(3,6));//begin index,lastind+1
        System.out.println(name.replace('h','y'));
        System.out.println(name3.toLowerCase());//obj.method();
        System.out.println(name3.toUpperCase());
        System.out.println(name5.indexOf('b'));//gives first index
        System.out.println(name5.lastIndexOf('b'));//gives last index
        System.out.println(name5.indexOf('z'));//-1
        System.out.println(name5.lastIndexOf('Z'));//-1
    }
}
