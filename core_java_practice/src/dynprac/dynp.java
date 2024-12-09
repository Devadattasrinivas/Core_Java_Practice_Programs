package dynprac;

public class dynp {
    private int data[];
    private int nxtind;
    public dynp(){
        data=new int[5];
        nxtind=0;
    }
    public int get(int i){
        if(i>=nxtind){
            return -1;
        }
        return data[i];
    }
    public int size(){
        return nxtind;
    }
    public boolean isEmpty(){
        return nxtind==0;
    }
    public void set(int i,int elem){
       if(i>=nxtind){
           return;
       }
       data[i]=elem;
    }
    public void  add(int ele){
        if(data[nxtind]==data.length){
          doubleCapacity();
        }
        data[nxtind]=ele;
        nxtind++;
    }
    private void doubleCapacity(){
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }
    public int lastremove(){
        if(nxtind==0){
            return -1;
        }
        int temp=data[nxtind-1];
        nxtind--;
        return temp;
    }
}
