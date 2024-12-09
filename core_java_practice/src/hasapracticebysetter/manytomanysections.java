package hasapracticebysetter;
//target:students (target)
public class manytomanysections {
   private int s1no;
   private String s1name;
   //has a var
   private  manytomany matoma;
   public void setS1no(int s1no){
       this.s1no=s1no;
   }

    public int getS1no(){
     return s1no;
    }

   public void setS1name(String s1name){
       this.s1name=s1name;
   }
    public String getS1name(){
      return s1name;
    }
    public void setMatoma(manytomany matoma){
       this.matoma=matoma;
    }
    public manytomany getMatoma(){
       return matoma;
    }
}
