
// import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();

        String[] arr = A.split("");
        String[] reversed = new String[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }

        if (Arrays.toString(arr).equals(Arrays.toString(reversed))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
