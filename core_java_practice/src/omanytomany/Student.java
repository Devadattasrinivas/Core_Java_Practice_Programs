package omanytomany;
//target
public class Student {
    int sid;
    String sname;
    String sadd;

    courses[] c;
    public Student(int sid,String sname,String sadd,courses[] c){
        super();
        this.sid=sid;
        this.sname=sname;
        this.sadd=sadd;
        this.c=c;
    }
    public void details(){
        System.out.println("sid "+sid);
        System.out.println("sname"+sname);
        System.out.println("sadd "+sadd);

        //courses are 3-4 so use array
        for(courses c1:c){
            System.out.println("cid "+c1.cid);
            System.out.println("cname "+c1.cname);
            System.out.println("ccost "+c1.ccost);
            System.out.println("===============================");

        }

    }
}
