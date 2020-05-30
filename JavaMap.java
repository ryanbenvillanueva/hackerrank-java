
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phonebook = new HashMap<>();
        List<String> query = new ArrayList<>();
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phonebook.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            query.add(s);
        }

        for (String s : query) {
            if (phonebook.containsKey(s)) {
                System.out.println(s + "=" + phonebook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
