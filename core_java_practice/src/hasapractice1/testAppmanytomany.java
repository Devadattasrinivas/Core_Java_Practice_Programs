package hasapractice1;
import hasapractice.manytomany;
import hasapractice.courses;

public class testAppmanytomany{
    public static void main(String args[]){
        courses  cou=new courses(1,"english",3000);
        courses  cou1=new courses(2,"engli",9000);
        courses  cou2=new courses(8,"lish",7000);
        courses[] c=new courses[3];
        c[0]=cou;
        c[1]=cou1;
        c[2]=cou2;

        manytomany m=new manytomany(1,"deva","madhur",c);
        manytomany m1=new manytomany(2,"dev","mad",c);
        manytomany m2=new manytomany(3,"de","ma",c);
        m.disp();
        m1.disp();
        m2.disp();



    }
}
