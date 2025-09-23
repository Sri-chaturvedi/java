package ArrayListquestions;
import java.util.ArrayList;

public class ALQ {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
    }
}
