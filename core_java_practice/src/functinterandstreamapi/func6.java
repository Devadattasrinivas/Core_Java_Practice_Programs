package functinterandstreamapi;

interface inter{
    public void m2(int i);//passing  data using lamda
}
public class func6 {
    //from methodref
    public void logiccoded(int i){//when binding args type and var name shouldbe matched
        System.out.println("method ref");
    }
    public static void main(String[] args) {
        //using lamda ref
        inter l=i ->System.out.println("lamda");//impelemting interface method here
        l.m2(6);

        //calling instance method of current class  by implemented method of interface after binding process of instance method with the class in which it present
        //using methref //obj::methodname()
        inter f=new func6()::logiccoded;//we arent writing code that instance method creating obj using
        System.out.println(f);
        f.m2(10);

    }
}
