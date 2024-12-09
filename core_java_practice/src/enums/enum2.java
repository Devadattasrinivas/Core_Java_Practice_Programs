package enums;
enum Course{
    JAVA,JEE,SPRINGBOOT;
    int courseId;
    Course(){
        System.out.println("constructor in enum");
    }
    public void setCourseId(int courseId){
       this.courseId=courseId;
    }
    public int getCourseId(){
        return courseId;
    }
}
public class enum2 {
    public static void main(String args[]){
    Course.JAVA.setCourseId(10);
    int a=Course.JAVA.getCourseId();
    System.out.println(a);
    }
}
