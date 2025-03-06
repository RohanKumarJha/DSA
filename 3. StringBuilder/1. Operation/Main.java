public class Main {
    public static void main(String[] args) {
        String str = "Leetcode is best platform";
        StringBuilder sb = new StringBuilder(str);

        // Operation 1
        sb.append(" for learning dsa");
        System.out.println(sb);

        // Operation 2
        sb.insert(16, "est");
        System.out.println(sb);

        // Operation 3
        sb.replace(16, 19, "");
        System.out.println(sb);

        // Operation 4
        sb.delete(25,42);
        System.out.println(sb);

        // Operation 5
        sb.reverse();
        System.out.println(sb);

        // Operation 6
        System.out.println(sb.length());

        // Operation 7
        System.out.println(sb.charAt(5));

        // Operation 8
        sb.setLength(15);
        System.out.println(sb);

        // Operation 9
        sb.setCharAt(2, 'z');
        System.out.println(sb);
    }
}