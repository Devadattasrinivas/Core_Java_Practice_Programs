package stringpack;
/*
public class codesnipinh {
    int count;
    private static void increment(codesnipinh counter){
        counter.count++;
    }
    public static void main(String args[]){
        codesnipinh c1=new codesnipinh();//one obj created
        codesnipinh c2=c1;//ref created not obj
        codesnipinh c3=null;//ref type
        c2.count=1000;
        increment(c2);//call by ref

    }
}
 */
/*
public class codesnipinh {
    public static void main(String args[]) {
    String res="";
    loop:for(int i=1;i<=5;i++){
        switch(i){
            case 1:
                res+="UP";
                break;
            case 2:
                res+="To";
                break;
            case 3:break;
            case 4:res+="date";
            break loop;
        }
    }
       System.out.println(String.join("-",res.split(" "))) ;
    }
    }

 */
 /*
public class codesnipinh {
    public static void main(String args[]) {
        String res="";
        String arr[]={"dog",null,"float"};
        for(String s:arr){
            res+=String.join("-",s);//""+(-,dog)##dog+(-,null)###dognull+(-,"float)there are no 2 strings so delimeter wont work
        }
        System.out.println(res);
    }
    }
*/
/*
public class codesnipinh {
    public static void main(String args[]) {
        String chs[][]=new String[2][];
        chs[0]=new String[2];chs[1]=new String[5];int i=97;
        for(int a=0;a<chs.length;a++){
            for(int b=0;b<chs.length;b++){
                chs[a][b]=""+i;
                i++;
            }
        }
        for(String[] s:chs){
              for(String sc:s){
                 System.out.println(sc);
              }
                  System.out.println();
        }
    }
}
 */
/*
public class codesnipinh {
    public static void main(String args[]) {
            String ta="A";
            ta=ta.concat("B");
            String tb="c";
            ta.replace("c","");
            ta=ta.concat(tb);
            System.out.println(ta);

    }
}

 */
/*
 public class codesnipinh {
    public static void main(String args[]) {
        StringBuilder b = new StringBuilder("B");
        b.append(b.append("A"));
        System.out.println(b);
    }
}
 */

public class codesnipinh {
    public static void main(String args[]) {
        String arr[]={"1st","2nd","3rd","4th"};
        String place="faraway";
        System.out.println(arr[place.indexOf("a",3)]);
    }
}