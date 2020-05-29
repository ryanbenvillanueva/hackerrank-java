import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String query = scanner.next();
            if (query.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
            } else {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }
        scanner.close();

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}