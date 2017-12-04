package fulliron;
import java.util.*;

//TODO with linkedlist

public class Clients {
    public static void main(String[] args) {
        Scanner in = new Scanner("1 2 3 4 5 6 7 8 9 0");
        ArrayList trans = new ArrayList();

        while (in.hasNextInt()) {trans.add(in.nextInt());}
        for (Object tran : trans) {System.out.print(tran + " ");};
    }
}
