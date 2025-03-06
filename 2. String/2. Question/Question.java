import java.util.Arrays;

public class Question {
    public static void printString(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i));
        } System.out.println();
    }

    public static String reverseWholeString(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--) {
            sb.append(str.charAt(i));
        } return sb.toString();        
    }

    public static void reverseStringSplitwise(String str) {
        String[] strArray = str.split(" ");
        for(int i=strArray.length-1; i>=0; i--) {
            System.out.print(strArray[i]+" ");
        } System.out.println();
    }

    public static boolean validAnagram(String str1,String str2) {
        if(str1.length() != str2.length()) return false;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    public static boolean validPalindrome(String str) {
        int start=0, end=str.length()-1;
        while(start < end) {
            if(str.charAt(start++) != str.charAt(end--)) return false;
        } return true;
    }

    public static void countVowelConsonants(String str) {
        int size = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='a' | str.charAt(i)=='e' | str.charAt(i)=='i' | str.charAt(i)=='o' | str.charAt(i)=='u') size++;
        }
        System.out.println("Vowels are "+size+" and consonants are "+(str.length()-size));
    }
}