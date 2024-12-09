package dynpracUse;
import dynprac.dynp;
import java.util.ArrayList;
public class dynpu {
    public static void main(String args[]) {
        dynp d = new dynp();
        for (int i = 1; i < 100; i++) {
            d.add(100 + i);
        }
        d.set(2, 5);
        System.out.println(d.get(2));
        System.out.println(d.isEmpty());
        while (!d.isEmpty()) {
            System.out.println(d.lastremove());
            System.out.println(d.size());
        }
    }
}
