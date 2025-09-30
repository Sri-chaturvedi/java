package StringBuilder_SetCharAt;

public class StringBuilder_SetCharAt {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        // Change character at index 0
        sb.setCharAt(0, 'K'); 

        System.out.println("After setCharAt: " + sb);
    }
}

