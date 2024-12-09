package functinterandstreamapi;

import java.util.function.Predicate;

//finding numbers greater than 10
/*
public class fun3 {
    public static void main(String[] args) {
        int a[]={5,12,34,56,10,20};
        int b[]=new int[a.length];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>10){ //testing a conditon and writing so use predicate
                b[j]=a[i];
                b[j]++;
                System.out.print(b[j]+" ");
            }
        }
    }
}
 */
//writing a predicate to get numbers>10 in an array
public class func3 {
    public static void main(String[] args) {
        int a[]={12,67,9,45,4};
        Predicate<Integer> p1=i1->i1>10;//lamda expression for predicate condition
        System.out.println("element greater than 10");
        m1(p1,a);

        Predicate<Integer> p2=i1->i1%2==0;//lamda expression
        System.out.println("element even");
        m1(p2,a);

        System.out.println("element greater than 10 and element even");
        m1(p1.and(p2),a);//combining two methods  method also available in predicate interface

        System.out.println("element greater than 10 or element even");
        m1(p1.or(p2),a);
        System.out.println("elements which are not even");
        m1(p2.negate(),a);//no need to pass arg (oppo to positive-negative(is negate))

    }
    public static void m1(Predicate<Integer> p,int x[]){
        for(int ele:x){//in an array checking predicate test condition on every obj,if condi true on that obj print that obj
            if(p.test(ele))//ele-ele>10
                System.out.println(ele+" ");
        }
    }
}
