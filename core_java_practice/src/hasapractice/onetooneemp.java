package hasapractice;
//target object
public class onetooneemp {
    int eid;
    String ename;
    String eadd;
    //has-a var
    onetoone acc;
    //constructor injection
    public onetooneemp(int eid,String ename,String eadd,onetoone acc){
        super();
        this.eid=eid;
        this.ename=ename;
        this.eadd=eadd;
        this.acc=acc;
    }
    public void disp(){
        System.out.println("employee details: ");
        System.out.println("eid: "+eid);
        System.out.println("ename: "+ename);
        System.out.println("eadd: "+eadd);
        System.out.println("=====================");
        System.out.println("account  details: ");
        System.out.println("acc id: "+acc.accno);
        System.out.println("acc name: "+acc.accname);
        System.out.println("acc type: "+acc.acctype);

    }
}
