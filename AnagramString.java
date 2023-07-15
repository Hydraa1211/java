import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    public static void isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");

        if (s1.length() != s2.length()) {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
            return;
        }

        char[] array1 = s1.toLowerCase().toCharArray();
        char[] array2 = s2.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (Arrays.equals(array1, array2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string 1:");
        String str1 = sc.nextLine();
        System.out.print("Enter the string 2:");
        String str2 = sc.nextLine();

        isAnagram(str1, str2);
    }
}