package omanytoone;
//dependent
public class branch {
    private static  String bid;
     private static  String name;
    public   void setBid(String bid){
        this.bid=bid;
    }
    public  String getBid(){
        return bid;
    }
    public  void setName(String name){
         this.name=name;
    }
    public  String getName(){
         return name;
    }
}
