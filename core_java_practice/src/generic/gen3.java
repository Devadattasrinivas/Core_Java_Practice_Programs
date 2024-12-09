package generic;
//normal class-class with no parameter
//generics-class with type parameter
class generics<T extends Number>{//<T extends X>x-can be class we can pass x or its child type
                                  //x can be interface we can pass  xor its implemented class


}
class Sample<S extends Runnable>{

}

public class gen3 {
    public static void main(String[] args) {
        generics<Integer> g=new generics<Integer>();
        Sample<Thread> s=new Sample<Thread>();
        Sample<Runnable> s1=new Sample<Runnable>();
       // Sample <Integer> s2=new Sample<Integer>();type paramter not matched

    }
}
