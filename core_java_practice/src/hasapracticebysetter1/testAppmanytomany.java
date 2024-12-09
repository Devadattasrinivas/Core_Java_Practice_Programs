package hasapracticebysetter1;
import hasapracticebysetter.manytomany;
import hasapracticebysetter.manytomanysections;
public class testAppmanytomany {
    public static void main(String args[]){
        manytomany matoma =new manytomany();
        manytomany matoma1 =new manytomany();
        manytomany matoma2 =new manytomany();

        manytomanysections m=new manytomanysections();
        manytomanysections m2=new manytomanysections();
        manytomanysections m3=new manytomanysections();


        matoma.setSection(1);
        matoma.setSectionname("panda");

        matoma1.setSection(14);
        matoma1.setSectionname("pwanda");


        matoma2.setSection(11);
        matoma2.setSectionname("pranda");


        m.setS1no(1);
        m.setS1name("deva");
        m.setMatoma(matoma);

        m2.setS1no(9);
        m2.setS1name("dev");
        m2.setMatoma(matoma1);

        m3.setS1no(2);
        m3.setS1name("dva");
        m3.setMatoma(matoma2);

        System.out.println(m.getS1no());
        System.out.println(m.getS1name());
        System.out.println(m.getMatoma().getSection());
        System.out.println(m.getMatoma().getSectionname());
        System.out.println("==============================");


        System.out.println(m2.getS1no());
        System.out.println(m2.getS1name());
        System.out.println(m2.getMatoma().getSection());
        System.out.println(m2.getMatoma().getSectionname());
        System.out.println("==============================");


        System.out.println(m3.getS1no());
        System.out.println(m3.getS1name());
        System.out.println(m3.getMatoma().getSection());
        System.out.println(m3.getMatoma().getSectionname());


    }
}
