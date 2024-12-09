package hasapracticebysetter1;
import hasapracticebysetter.onetomany;
import hasapracticebysetter.onetomanystu;
public class testApponetomany {
    public static void main(String args[]){
        //one
        onetomany ontom=new onetomany();
        ontom.setSid(1);
        ontom.setSecname("A");
        //many
        onetomanystu o1=new onetomanystu();
        o1.setSsid(2225);
        o1.setSsname("deva");
        o1.setOntom(ontom);

        onetomanystu o2=new onetomanystu();
        o2.setSsid(25);
        o2.setSsname("de");
        o2.setOntom(ontom);

        onetomanystu o3=new onetomanystu();
        o3.setSsid(245);
        o3.setSsname("dett");
        o3.setOntom(ontom);


        //display by target class
        System.out.println("sid: "+o1.getOntom().getSid());
        System.out.println("secname: "+o1.getOntom().getSecname());
        System.out.println("ssid: "+o1.getSsid());
        System.out.println("ssname: "+o1.getSsname());

        System.out.println("================================");


        System.out.println("ssid: "+o2.getSsid());
        System.out.println("ssname: "+o2.getSsname());
       // System.out.println("sid: "+o2.getOntom().getSid());
       // System.out.println("secname: "+o2.getOntom().getSecname());
        System.out.println("================================");


        System.out.println("ssid: "+o3.getSsid());
        System.out.println("ssname: "+o3.getSsname());
       // System.out.println("sid: "+o3.getOntom().getSid());
       // System.out.println("secname: "+o3.getOntom().getSecname());
        System.out.println("================================");










    }
}
