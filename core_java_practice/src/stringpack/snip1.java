package stringpack;

public class snip1 {

           /* String[] arr={"a","b","c","d"};
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
                if(arr[i].equals("c"))
                    continue;//under if  only one statement
                System.out.println("work done");
                break;

            */
            /*
            String[] str=new String[2];
            int idx=0;
            for(String s:str){
                str[idx].concat("element"+idx);
                idx++;
            }
            for(idx=0;idx<str.length;idx++){
                System.out.println(str[idx]);
            }

             */
             /*
            String[][] arr={{"a","b","c"},{"d","e"}};
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.println(arr[i][j]+ " ");
                    if(arr[i][j].equals("b"))
                        break;
                }
                continue;

              */
             /*
            StringBuffer sb=new StringBuffer("java");
            String s="java";
            if(sb.toString().equals(s.toString()))//content of Stringbuffer sb converted into string s,sb content and s contenet equal
                System.out.println("match 1");
            else if(sb.equals(s))
                System.out.println("match 2");
            else
                System.out.println("no match");


              */
            // int[] a=new int[-5]; negative size how to bifurcate that space into  locations
            //int[] a=new int[] array size cant be empty
            //int[] a=new int[0] arry size should be mentioned how much will not check by jvm
           public static void main(String[] args) {

               if ((isItSmall(3)) || (isItSmall(7))) {//short circuit or operater isItSmall method return type must be boolean
                   System.out.println("result is true");
               }


               if ((isItSmall(6)) || (isItSmall(9))) {//first cond is false so goto second cond
                   System.out.println("result is true");
               }
           }
          public static boolean isItSmall(int i){
              if(i<5){
                  System.out.println("i<5");
                  return true;
                }
              else{
                    System.out.println("i>=5");
                    return false;
                }
            }
        }


