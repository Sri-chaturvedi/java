package StringBuilder_LengthCapacity;

public class StringBuilder_LengthCapacity {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println("Initial capacity: " + sb.capacity());

        sb.append("Hello World!");

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}

