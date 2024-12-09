package omanytoone;
//target
public class student {
    private String sid;
    private String sname;
    private  String sadd;

    //has-a var
    branch b;
    //setter injection
    public void setSid(String id){
        this.sid=sid;
    }
    public String getSid(){
        return sid;
    }
    public void setSname(String sname){
        this.sname=sname;
    }
    public String getSname(){
        return sname;
    }
    public void setSadd(String add){
        this.sadd=sadd;
    }
    public String getSadd(){
        return sadd;
    }
    public void setB(branch b){
       this.b=b;
    }
   public branch setB(){
        return b;
   }
}
