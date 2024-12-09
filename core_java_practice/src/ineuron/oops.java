package ineuron;

 class hello{
    int x=10;//memory not allocated to instance var only datatype known to jvm value of var after allocating memory in heap area
    String name="deva";//instance var
    int num=19;

}
public class oops {
    int i=18;
    public static void main(String args[]){
        //System.out.println(i);(obj not created so error when trying to print i

        hello h=new hello();
        oops o=new oops();
        System.out.println(o.i);//obj created through new memory for var allocated
        System.out.println(h.x);
        System.out.println(h.name);
        System.out.println(h.num);
        o.instanceMethod();//instancemethod calling
    }
    //instancemethod from oops class
    public void instanceMethod(){
        System.out.println(i);

    }
}
