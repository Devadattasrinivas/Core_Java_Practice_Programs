package hasapracticebysetter1;

public class testAppmanytoone {
    public static void main(String args[]){
        manytoone matoon=new manytoone();
        manytoonestu mstu=new manytoonestu();
        manytoonestu mstu1=new manytoonestu();
        manytoonestu mstu2=new manytoonestu();

        matoon.setFid(1);
        matoon.setFname("A");

        mstu.setStuid(11);
        mstu.setStuname("deva");
        mstu.setMatoon(matoon);


        mstu1 .setStuid(12);
        mstu1.setStuname("dev");

        mstu2.setStuid(13);
        mstu2.setStuname("de");

        System.out.println(mstu.getStuid());
        System.out.println(mstu.getStuname());

        System.out.println(mstu1.getStuid());
        System.out.println(mstu1.getStuname());

        System.out.println(mstu2.getStuid());
        System.out.println(mstu2.getStuname());

        System.out.println("========================");


        System.out.println(mstu.getMatoon().getFid());
        System.out.println(mstu.getMatoon().getFname());

        System.out.println();
        System.out.println();


    }
}
