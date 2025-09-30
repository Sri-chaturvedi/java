package StringBuilder_Append;

public class StringBuilder_Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Append different types
        sb.append(" World");
        sb.append(123);
        sb.append('!');

        System.out.println("After append: " + sb);
    }
}
