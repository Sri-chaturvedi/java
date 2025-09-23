public class sBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sri");
        System.out.println(sb);

        //charAt index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);
    }
}
