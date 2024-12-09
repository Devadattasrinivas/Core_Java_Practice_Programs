package filehandling;
import java.io.*;
public class file7prac {
    public static void main(String[] args) {
        String location="C:\\javaprograms";
        File f=new File(location);
        String[] names=f.list();
        int jpgfile=0;
        int pngfile=0;
        int txtfile=0;
        int dir=0;
        for(String naam:names){
           File f1=new File(f,naam);
            if(f1.isDirectory()){
                dir++;
                System.out.println(naam+"directory--------------------");
            }
            if (naam.endsWith(".txt")) {

            }
            if (f1.isFile()) {
                if (naam.endsWith(".png")) {
                     pngfile++;
                }
                if (naam.endsWith(".jpg")) {
                    jpgfile++;
                }
                if(naam.endsWith(".txt")){
                    txtfile++;
                }
                System.out.println(naam+" file++++++++++++");
            }
        }

        System.out.println(jpgfile+" jpgcount");
        System.out.println(pngfile+" pngcount");
        System.out.println(txtfile+" txtcount");
        System.out.println(dir+" dircount");
    }
}
