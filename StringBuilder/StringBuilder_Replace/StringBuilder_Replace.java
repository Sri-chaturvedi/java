package StringBuilder_Replace;

public class StringBuilder_Replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java is fun");

        // Replace "fun" with "awesome"
        sb.replace(8, 11, "awesome");

        System.out.println("After replace: " + sb);
    }
}

