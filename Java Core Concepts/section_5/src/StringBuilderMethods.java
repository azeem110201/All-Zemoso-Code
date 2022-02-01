public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Mohd Azeem");
        sb.append(" is very kind");
        System.out.println(sb);
        sb.insert(5,"Abdul ");
        System.out.println(sb);
        sb.delete(5,11);
        System.out.println(sb);
        sb.replace(sb.lastIndexOf("A"),sb.length(),"is amazing");
        System.out.println(sb);
        sb.insert(0,"Dr. ");
        System.out.println(sb);
    }
}
