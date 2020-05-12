import java.io.*;
import java.util.*;


public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] arrOfStr = s.trim().split("[!@,.'_ ?]+");

        if (s.trim().equals("")) {
            System.out.println("0");
        } else if (s.length() > 400000) {
            return;
        } else {
            System.out.println(arrOfStr.length);
        }
        
        for (String str : arrOfStr) {
            System.out.println(str);
        }
        scan.close();
    }
}

 
 