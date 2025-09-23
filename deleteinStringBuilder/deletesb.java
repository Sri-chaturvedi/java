package deleteinStringBuilder;

public class deletesb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sriii");

        // delete the extra 'i'

        sb.delete(3, 5);
        System.out.println(sb);
    }
}
