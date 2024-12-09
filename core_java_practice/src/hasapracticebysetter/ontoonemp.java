package hasapracticebysetter;

public class ontoonemp {
    private int eid;
    private  String ename;
    //has-a var;
    ontoon onto;

    //setter injection
    public void setEid(int eid){
        this.eid=eid;
    }
    public int getEid(){
        return eid;
    }
    public void setEname(String ename){
        this.ename=ename;
    }
    public String getEname(){
        return ename;
    }
    public  void setOnto(ontoon onto){
        this.onto=onto;
    }
    public ontoon getOnto(){
        return onto;
    }

}
