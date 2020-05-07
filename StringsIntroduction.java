
// import java.io.*;
import java.util.*;

public class StringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String[] aLetters = A.split("");
        String[] bLetters = B.split("");

        aLetters[0] = aLetters[0].toUpperCase();
        bLetters[0] = bLetters[0].toUpperCase();

        String upA = String.join("", aLetters);
        String upB = String.join("", bLetters);

        System.out.println(upA + " " + upB);

    }
}
