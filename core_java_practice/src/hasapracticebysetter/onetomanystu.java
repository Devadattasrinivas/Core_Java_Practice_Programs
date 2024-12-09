package hasapracticebysetter;
//students;target
public class onetomanystu {
    private int ssid;
   private  String ssname;
    //has-a variable
    onetomany ontom;
    public void setSsid(int ssid){
        this.ssid=ssid;
    }
    public int getSsid(){
        return ssid;
    }
    public void setSsname(String ssname){
        this.ssname=ssname;
    }
    public String getSsname(){
        return ssname;
    }
    public void setOntom(onetomany ontom){
        this.ontom=ontom;
    }
    public onetomany getOntom(){
        return ontom;
    }
}
