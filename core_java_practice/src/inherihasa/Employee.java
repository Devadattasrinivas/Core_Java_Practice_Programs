package inherihasa;
//target
public class Employee {
     int empid;
     String emname;
     String emadd;

     //has a relship
     account acc;
     public  Employee(int empid,String emname,String add,account acc){
         super();
         this.empid=empid;
         this.emname=emname;
         this.emadd=add;
         this.acc=acc;
     }
     public void empdetails(){
         System.out.println("employee details");
         System.out.println("empid "+empid);
         System.out.println("emname "+emname);
         System.out.println("emadd "+emadd);
         System.out.println("======================");
         System.out.println("account details");
         System.out.println("accno "+acc.accno);
         System.out.println("accname "+acc.accname);
         System.out.println("acctype "+acc.acctype);
     }

}
