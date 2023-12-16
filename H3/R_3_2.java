package H3;
import java.util.ArrayList;
import java.util.Random;
public class R_3_2 {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> num = new ArrayList<Integer>();
    {num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);}
    public String removeentry() {
        Random r_n = new Random();
        int a;
        int removed;
        for (int i = num.size(); i > 0; i--) {
            a = r_n.nextInt(i);
            removed = num.remove(a);
            System.out.println(removed);
        }
        return "done";
    }


}
