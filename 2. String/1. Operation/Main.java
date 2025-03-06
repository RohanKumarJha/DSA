public class Main {
    public static void main(String[] args) {

        // Operation 1
        String str1 = "Rohan ";
        String str2 = "Kumar";
        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));

        // Operation 2
        System.out.println(str1.length());

        // Operation 3
        System.out.println(str1.substring(0, 4));

        // Operation 4
        System.out.println(str1.charAt(3));

        // Operation 5
        str1.replace("Rohan ", "No");
        System.out.println(str1);

        // Operation 6
        String name = "Rohan Kumar Jha";
        String[] arr = name.split(" ");
        for(String str : arr) {
            System.out.print(str);
            System.out.println();
        }

        // Operation 7
        String str3 = "         Rohan Kumar Jha          ";
        System.out.println(str3);
        System.out.println(str3.trim());

        // Operation 8
        String str4 = "I am a good boy";
        System.out.println(str4.toLowerCase());
        System.out.println(str4.toUpperCase());

        // Operation 9
        System.out.println(str4.contains(("Good").trim().toLowerCase()));

        // Operation 10
        System.out.println(str4.indexOf(("GOOD").trim().toLowerCase()));

        // Operation 11
        char[] ch = str4.toCharArray();
        for(char i : ch) {
            System.out.println(i);
        }
    }
}
