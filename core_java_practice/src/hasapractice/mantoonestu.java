package hasapractice;
//target object
public class mantoonestu {
    int ssid;
    String name;
    //has a var
    manytoone[] many;
    public mantoonestu(int ssid,String name,manytoone[] many){
        this.ssid=ssid;
        this.name=name;
        this.many=many;
    }
    public void details(){
        System.out.println("ssid: "+ssid);
        System.out.println("name: "+name);
        System.out.println("====================");

        for(manytoone m:many){
            System.out.println("subno: "+m.subno);
            System.out.println("subname: "+m.subname);
            System.out.println("subsc: "+m.subsc);
        }

    }
}
