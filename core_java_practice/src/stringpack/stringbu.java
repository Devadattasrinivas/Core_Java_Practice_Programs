package stringpack;

public class stringbu {

        /*
    StringBuilder a=new StringBuilder();
    a.append(450);
        System.out.println(a.length());
    System.out.println(a.capacity());
    a.append('r');
    System.out.println(a);
    a.append("hfff");
        System.out.println(a.length());
        System.out.println(a.length());
        System.out.println(a.capacity());

         */

/*
        StringBuilder b=new StringBuilder(3);
        System.out.println(b.length());//0
        System.out.println(b.capacity());//3
        b.append("fgyr567877789");
        System.out.println(b.length());//3
        System.out.println(b.capacity());//3 (ingen capacity is 3 as dec;ared in cons once
        //completed that cap(3) then new capcity=oldcpa+1 and again how much length that much cpacity increasing

 */

/*
        StringBuilder c=new StringBuilder("sachin");
        System.out.println(c.length());
        System.out.println(c.capacity());
        c.append("rjhfswrtyuioplkj6");
        System.out.println(c.length());
        System.out.println(c.capacity());

        System.out.println(c.charAt(6));
        c.setCharAt(6,'y');
        System.out.println(c);

 */
/*
        //creating temp array a and assigning existing arrray values from b
        int b[]={32,4,64};
        int a[]=new int[5];
        a=b;//d b reference referencing to a both referencing to one array
        System.out.println(a);//3
        System.out.println(b);
        for(int arr:a){
            System.out.println(arr);
        }
        for(int arr:b){
            System.out.println(arr);
        }


 */

public static void main(String args[]) {
    display(new int[]{45, 67, 89});
}
        //anonymous array
        static void  display(int[] a){
            for(int ele:a){
                System.out.print(ele+" ");
            }



    }
    }

