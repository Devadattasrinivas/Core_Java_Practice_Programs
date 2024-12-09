package hasapracticebysetter;
//manytomany:many students many sections
//sections dependent
public class manytomany {
    private int section;
    private  String sectionname;

    public void setSection(int section){
        this.section=section;
    }
    public int getSection(){
        return section;
    }
    public void setSectionname(String sectionname){
        this.sectionname=sectionname;
    }
    public String getSectionname(){
        return sectionname;
    }
}
