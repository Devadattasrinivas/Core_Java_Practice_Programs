package hasapractice1;
import hasapractice.manytoone;
import hasapractice. mantoonestu;
//manytoone
public class testAppmanytoone {
    public static void main(String args[]){
        manytoone man=new manytoone(1,"telugu",98);
        manytoone man1=new manytoone(2,"hindi",99);
        manytoone man2=new manytoone(3,"english",90);

        manytoone[] ma=new manytoone[3];
        ma[0]=man;
        ma[1]=man1;
        ma[2]=man2;
        mantoonestu st=new mantoonestu(1,"deva",ma);
        st.details();

    }
}
