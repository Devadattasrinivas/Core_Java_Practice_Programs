package threefinprac;
class thiss{
  private String name;
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
      return name;
  }
}
public class p9 {
    public static void main(String args[]){
     thiss s=new thiss();
     thiss s1=new thiss();
     s.setName("for");
     s1.setName("wer");
     String name=s.getName();
     String name1=s1.getName();
     System.out.println(name);
     System.out.println(name1);



    }
}
