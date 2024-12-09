package hasapracticebysetter1;

public class hasapartcodesni {
    public static void main(String args[]){
        /*
    final String fName="James";
    String iName="gosling";
    String name1=fName+iName;
    String name2=fName+"gosling";
    String name3="james"+"gosling";
    System.out.println(name1==name2);
    System.out.println(name2==name3);
         */

        /*
        final int i=1;
        final Integer i1=2;
        final String s1=":ONE";
        String str1=i+s1;
        String str2=i1+s1;
        System.out.println(str1=="1:ONE");
        System.out.println(str2=="1:ONE");//i1 is wrapper memory allocated at run time
         */
/*
        String javaworld="JavaWorld";//scp
        String java="java";//scp
        String world="World";//scp
        java+=world;//jvm(heap) so false
        System.out.println(java==javaworld);

 */
        /*
        StringBuilder sb=new StringBuilder("spaceStation");
        sb.delete(5,6).insert(5," s").toString().toUpperCase();//Stringbuilder coverted to  string obj in heap ny toString() method
        System.out.println(sb);
         */

        /*
        String text="one";
        System.out.println(text.concat(text.concat("eleven ")).trim());//(one.concat("one".("eleven").trim())
         */

        /*
        String str="PANIC";
        StringBuilder sb=new StringBuilder("thet");
        System.out.println(str.replace("N",sb));
         */
/*
        boolean flag1="java"=="java".replace('j','j');
        boolean flag2="java"=="java".replace("j","j");//replace same content so no change in the object
        System.out.println(flag1&&flag2);

 */
/*
        String place="MISSS";
        System.out.println(place.replace("SS","T"));

 */
        /*
        String str="alaska";
        System.out.println(str.charAt(str.indexOf("A")+1));

         */
        /*
        StringBuilder sb=new StringBuilder("tomato");
        System.out.println(sb.reverse().replace("o","p"));

         */

        String[] str="ineuron_technology_private_limited_known_for_java".split("_",3);//3 denotes how many indexs it should have in an array
        //0-1-2(3)
        //0-ineuron
        //1-technology
        //privated.....known for java
        for(String st:str){
            System.out.println(st);
        }



    }
}
