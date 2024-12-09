package hasapracticebysetter1;
//students:target
public class manytoonestu {
    private int stuid;
    private String stuname;
    //has a var
    manytoone matoon;
    public void setStuid(int stuid){
        this.stuid=stuid;
    }
    public int getStuid(){
        return stuid;
    }
    public void setStuname(String stuname){
        this.stuname=stuname;
    }
    public String getStuname(){
        return stuname;
    }
    public void setMatoon(manytoone matoon){
        this.matoon=matoon;
    }
    public manytoone getMatoon(){
        return matoon;
    }

}
