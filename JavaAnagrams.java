import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String strA = a.toLowerCase();
        String strB = b.toLowerCase();

        int[] charsACount = new int[26];
        int[] charsBCount = new int[26];

        if (strA.length() != strB.length()) {
            return false;
        }

        for (int i = 0; i < strA.length(); i++) {
            charsACount[strA.charAt(i) - 'a']++;
            charsBCount[strB.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (charsACount[i] != charsBCount[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
