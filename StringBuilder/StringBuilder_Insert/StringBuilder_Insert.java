package StringBuilder_Insert;

public class StringBuilder_Insert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Helo");

        // Insert character at index 2
        sb.insert(2, 'l'); 

        System.out.println("After insert: " + sb);
    }
}
