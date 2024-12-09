package hasapractice;
//manytomany:students have so many courses
//student:target
public class manytomany {
    int sid;
    String sname;
    String sadd;
    //has-a var
    courses[] co;
    //constructor injection
    public manytomany(int sid,String sname,String sadd,courses[] co){
        this.sid=sid;
        this.sname=sname;
        this.sadd=sadd;
        this.co=co;
    }
    public void disp(){
       // for()
        System.out.println("sid: "+sid);
        System.out.println("sname: "+sname);
        System.out.println("sadd: "+sadd);
        System.out.println("=======================");

        for(courses c:co){
            System.out.println("cid: "+c.cid);
            System.out.println("cname: "+c.cname);
            System.out.println("cost: "+c.ccost);
            System.out.println("=======================");

        }
    }
}
