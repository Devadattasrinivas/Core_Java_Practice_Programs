package ineuron;

public class ternaryoperator {
    public static void main(String args[]){
        int a=100;
        int b=20;
        int c=78;
        int res=(a<b)?((b<c)?b:c):((c<a)?c:a);
        System.out.println(res);
    }
}
