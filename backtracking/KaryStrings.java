package backtracking;

import java.util.*;

public class KaryStrings {

    public static void main(String[] args) {
        int n = 3; // length of string
        int k = 3; // digits 0..k-1
      
        // Recursive version
        generateKaryStringsRecursive(n, k, "");

        // Iterative version
        generateKaryStringsIterative(n, k);
    }

    public static void generateKaryStringsRecursive(int n, int k, String prefix) {
        if (n == 0) {
            System.out.println(prefix);
            return;
        }

        // Try every digit from 0 to k-1 at this position
        for (int i = 0; i < k; i++) {
            generateKaryStrings(n - 1, k, prefix + i);
        }
    }

    public static void generateKaryStringsIterative(int n, int k) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(""); // start with empty string

        while (!queue.isEmpty()) {
            String s = queue.poll();

            if (s.length() == n) {
                System.out.println(s);
                continue;
            }

            // Append every digit from 0 to k-1
            for (int i = 0; i < k; i++) {
                queue.offer(s + i);
            }
        }
    }
}
