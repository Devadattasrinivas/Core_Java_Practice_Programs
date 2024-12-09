package stringpack;

public class pangramuplo {
    public static void main(String args[]){
        String  a1="the quick brown fox jumps over a lazy dog";
       // a1=a1.toUpperCase();
        a1=a1.replace(" ","");
        // System.out.println(a1);
        char[] ch=a1.toCharArray();
        System.out.println(ch.length);

        // System.out.println(a1);
        String a2="";
        boolean flag=false;
        int[] e=new int[26];
        for(int i=0;i<ch.length;i++){
            int index=ch[i]-'a';
            // System.out.println(index);
            e[index]++;
        }
        for(int i=0;i<e.length;i++){
            if(e[i]==0){
                System.out.println("not pangram");
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("pangram");
        }
    }
}
