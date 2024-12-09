package hasapractice1;
import hasapractice.onetoone;
import hasapractice.onetooneemp;

public class testApp {
    public static void main(String args[]){
        onetoone acc=new onetoone(1,"rcb","bbc");
        onetooneemp e=new onetooneemp(1,"deva","madhura",acc);
        e.disp();


    }
}
