package hasapracticebysetter;
//onetoone:employee has an account
//acount:dependent
public class ontoon {
    private String aco;
    private String branch;
    //setter injection
    public void setAco(String aco){
        this.aco=aco;
    }
    public String getAco(){
        return aco;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }
    public String getBranch(){
        return branch;
    }
}
