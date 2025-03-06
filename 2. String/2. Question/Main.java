public class Main {
    public static void main(String[] args) {
        String str1 = "Leetcode is best platform";

        // Question 1
        String answer = Question.reverseWholeString(str1);
        Question.printString(answer);

        // Question 1
        Question.reverseStringSplitwise(str1);

        // Question 2
        String str2="Listen", str3="Sileat";
        if(Question.validAnagram(str2.trim().toLowerCase(), str3.trim().toLowerCase())) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }

        // Question 3
        String str4 = "Rohor";
        if(Question.validPalindrome(str4.trim().toLowerCase())) {
            System.out.println("String are palindrome");
        } else {
            System.out.println("String are not palindrome");
        }

        // Question 4 
        String str5 = "I am a boy";
        Question.countVowelConsonants(str5.trim().toLowerCase());
    }
}
