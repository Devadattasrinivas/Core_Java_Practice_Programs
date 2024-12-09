package hasapractice1;
//target object  dependent
public class onetomany {
    String collname;
    String collcode;
    String colladd;

    Student[] stu;

    public onetomany(String collname, String collcode, String colladd, Student[] stu) {
        this.collname = collname;
        this.collcode = collcode;
        this.colladd = colladd;
        this.stu = stu;
    }


    public void displ() {
        System.out.println("college details: ");
        System.out.println("coll name: " + collname);
        System.out.println("coll code" + collcode);
        System.out.println("coll add" + colladd);
        System.out.println("=====================");
        System.out.println("Student details: ");

        for(Student s:stu){
        System.out.println("stu id: " + s.sid);
        System.out.println("sname id: " + s.sname);
        System.out.println("stu add: " + s.sadd);
        System.out.println("=====================");

        }

    }
}
