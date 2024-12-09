package hasapracticebysetter;
//one to many :one section has so many students
//section:dependent
public class onetomany {
    private int sid;
    private String secname;
    public void setSid(int sid){
        this.sid=sid;
    }
    public int getSid(){
        return sid;
    }
    public  void setSecname(String secname){
        this.secname=secname;
    }
    public String getSecname(){
        return secname;
    }
}
