class Question {
    public static void Question1(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append("for DSA");
        System.out.println(sb.reverse());
    }

    public static void Question2(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.replace(0, 8, "GFG");
        System.out.println(sb);
    }
}