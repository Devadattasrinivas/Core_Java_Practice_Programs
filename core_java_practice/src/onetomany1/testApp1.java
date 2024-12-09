package onetomany1;
import onetomany.employee;
import onetomany.branch;
public class testApp1 {
    public static void main(String args[]){
        //create dobjs not array so create array and oush those objects (e,e1,e2) into emp
      employee e=new employee(1,"deva","madh");
      employee e1=new employee(2,"de","madhu");
      employee e2=new employee(3,"dev","madhur");

     //constructor injection

      employee[] emp=new employee[3];
      emp[0]=e;
      emp[1]=e1;
      emp[2]=e2;
      branch b=new branch(1,"wer",emp);
      b.method();



    }
}
