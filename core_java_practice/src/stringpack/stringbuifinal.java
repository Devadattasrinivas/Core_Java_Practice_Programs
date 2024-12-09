package stringpack;

public class stringbuifinal{
    public static void main(String args[]){
        StringBuilder a=new StringBuilder("devadatta");

        //append
        a.append("drha");//append a string
        a.append('h');//append a char
        a.append(8);//append a num
        a.append(8);
       // a.append(8.7f);
        System.out.println(a);

        //insert
        a.insert(10,'u');//insert a char
        System.out.println(a);
        a.insert(9,"i");//insert a string
        System.out.println(a);
        a.insert(3,234);//insert a num
        System.out.println(a);

        //replace
        StringBuilder b=new StringBuilder("deva");
        b.replace(1,4,"ab3e");
        System.out.println(b);

        //delete
        b.delete(3,5);//deletes  start index,endind-1
        System.out.println(b);

        //capacity
        System.out.println(b.capacity());
        b.ensureCapacity(50);

        //trimtosize
        b.trimToSize();

        //charAt
        System.out.println(b.charAt(2));
        System.out.println(b);
        b.setCharAt(2,'r');
        System.out.println(b);
        System.out.println(b.deleteCharAt(2));

        //substring
        System.out.println(b.substring(1));//returns from start index
        System.out.println(b.substring(1,2));//returns from start index,endind-1
        System.out.println(b.capacity());

        //length
        System.out.println(b.length());

        //reverse
        System.out.println(b.reverse());

        //method chaining
        StringBuilder w=new StringBuilder("dairyam");
        w.append("raise").insert(5,"goat");
        System.out.println(w);

        //replace
        StringBuilder w1=new StringBuilder("dairyam");
        w1.replace(0,1,"eva");//at 0 will be inserted,char at by deleting char at 0 and index at 1 will be included in string
        System.out.println(w1);
        StringBuilder w2=new StringBuilder("roast");
        w2.replace(0,1,"c");
        System.out.println(w2);
        w2.replace(2,3,"o");
        System.out.println(w2);
        w2.replace(1,4,"utie");
        System.out.println(w2);

         //capacity declaration
        StringBuilder z=new StringBuilder();
        System.out.println(z.length());
        System.out.println(z.capacity());//default 16 char
        StringBuilder z1=new StringBuilder("sachin");//def cap+leng of str
        System.out.println(z1.capacity());
        StringBuilder z2=new StringBuilder(4);//cap declared in strbui const
        System.out.println(z2.capacity());
        z2.append("devad");//when cap finished (length+1)*2
        System.out.println(z2.capacity());





    }
}
