package onetomany;
//target
public class branch {
    int did;
    String name;
    //has a relship
    employee[] emp;
    public branch(int did,String name,employee[] emp){
        super();
        this.did=did;
        this.name=name;
        this.emp=emp;
    }
    public void method(){
        System.out.println("department details");
        System.out.println("did "+did);
        System.out.println("name "+name);
        System.out.println("====================");
        System.out.println("employee details:");
       //as emp is an array use loop
        for(employee em:emp){
           // System.out.println("eid: "+eid); call with ref name of emp class if not array or if it is array call with var in array created
            System.out.println("eid: "+em.eid);
            System.out.println("ename: "+em.ename);
            System.out.println("eadd: "+em.eadd);
        }

    }


}
