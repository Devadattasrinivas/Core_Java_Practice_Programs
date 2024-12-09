package fraction;

public class factioninc {
        private int num;
        private int den;
        public factioninc(int num,int den){
            this.num=num;
            this.den=den;
            simplify();
    }
    private void simplify(){
            int smaller=Math.min(num,den);
            int gcd=1;
            for(int i=2;i<=smaller;i++){
                if(num%i==0 && den%i==0){
                    gcd=i;
                }
            }
            num=num/gcd;
            den=den/gcd;
    }
    public void print(){
            System.out.println(num+"/"+den);
    }
    public void increment(){
            num=num+den;
            den=den;
            simplify();
    }
    public void add(factioninc f2){//f1 obj of class factioninc,void bcoz updating the first function by passing
       this.num=this.num*f2.den+f2.num*this.den;                       //second fraction as arg
       this.den=this.den*f2.den;
       simplify();
    }
    public static factioninc add(factioninc f,factioninc f2){//static bcoz passing 2 fractions and returning that new
       int newnum= f.num*f2.den+f2.num*f.den;//fraction not updating the first fraction as previous one.
       int newden= f.den*f2.den;
       factioninc f3=new factioninc(newnum,newden);
       return f3;

    }
}
