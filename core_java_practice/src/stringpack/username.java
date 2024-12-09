package stringpack;
import java.util.*;
public class username {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String user="govinda";
        String name="hello";
        String pass="Gov@017";
        String game="  jkkus dh  ";
        String ind="govindanamam";
        System.out.println("enter username");
        String username=s.next();
        System.out.println("enter password");
        String password=s.next();
        System.out.println(user.equalsIgnoreCase(username));
        System.out.println(pass.equals(password));
        /*
        System.out.println(user.substring(2));
        System.out.println(user.substring(1,5));//starting index,endind+1
        System.out.println(name.replace('e','o'));
        System.out.println(name.replace('e','y'));
        System.out.println(name.replace('h','y'));//args are only chars so we can replace only a char with char
        System.out.println(user.toUpperCase());
        System.out.println(user.toLowerCase());
        System.out.println(game.trim());//trim always trims spaces starting and ending of the string not in between
        System.out.println(game.trim());
        System.out.println(ind.indexOf('m'));
        System.out.println(ind.lastIndexOf('m'));
        System.out.println(ind.lastIndexOf('z'));
        System.out.println(ind.indexOf('z'));

         */

    }
}
