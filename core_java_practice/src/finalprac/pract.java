package finalprac;
//inst var methods
/*
public class pract {
    int i=3;
    String name="kanakadurga";
    char c='u';
    public static void main(String args[]){
       pract p=new pract();
       System.out.println(p.i);
       System.out.println(p.c);
       System.out.println(p.name);

       pract p1=new pract();
        System.out.println(p1.i);
        System.out.println(p1.c);
        System.out.println(p1.name);

    }
}

 */
public class pract {
    int i;
    String name;
    char c;
    public static void main(String args[]) {

        pract p = new pract();
        p.i = 21;
        p.name = "janaka";
        p.c = 'j';
        System.out.println(p.i);
        System.out.println(p.name);
        System.out.println(p.c);
        System.out.println();

        pract p1 = new pract();
        p1.i = 22;
        p1.name = "watch";
        p1.c = 'r';
        System.out.println(p1.i);
        System.out.println(p1.name);
        System.out.println(p1.c);
        p.instme();
    }
        public void instme(){
            System.out.println("inst method");
        }


}
