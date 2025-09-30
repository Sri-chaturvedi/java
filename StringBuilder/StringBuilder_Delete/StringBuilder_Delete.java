package StringBuilder_Delete;

public class StringBuilder_Delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Programming");

        // Delete characters from index 3 to 6 (exclusive of 6)
        sb.delete(3, 6);  

        System.out.println("After delete: " + sb);
    }
}
