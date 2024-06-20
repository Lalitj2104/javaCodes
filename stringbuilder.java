public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Stark");
        System.out.println(sb);

        System.out.println(sb.charAt(0));
        sb.setCharAt(4,'e');
        System.out.println(sb);
    }
}
