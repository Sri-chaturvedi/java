package StringBuilder_CombinedDemo;

public class StringBuilder_CombinedDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        sb.insert(5, "is ");
        sb.delete(0, 5);
        sb.replace(0, 2, "C");
        sb.reverse();

        System.out.println("Final StringBuilder result: " + sb);
    }
}
