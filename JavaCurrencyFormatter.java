// import java.io.*;
import java.util.*;
import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat i = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = u.format(payment);
        String india = i.format(payment);
        String china = c.format(payment);
        String france = f.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}