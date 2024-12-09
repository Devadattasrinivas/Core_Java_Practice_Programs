package immclass;

final public class immutaclass {
    int i;
    immutaclass(int t){
        i=t;
    }
    public  immutaclass meth(int i){
        if(this.i==i){
          return this;
        }else{
          return  new immutaclass(i);
        }
    }
    public static void main(String args[]){
        immutaclass t=new immutaclass(10);
        immutaclass t2=t.meth(10);
        System.out.println(t==t2);
    }
}
