package hasapracticebysetter1;
//manytoone:many students in one section
//section:dependent
public class manytoone {
    private int fid;
    private String fname;
    public void setFid(int fid){
        this.fid=fid;
    }
    public int getFid(){
        return fid;
    }
    public void setFname(String fname){
        this.fname=fname;
    }
    public String getFname(){
        return fname;
    }

}
