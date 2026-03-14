package backtracking;

import java.util.*;

public class GenerateBinaryStrings {

    private static List<String> result = new ArrayList<>();
    
    public static void main(String[] args) {
        int n = 2;

        // Call Iterative Version
        System.out.println("Iterative result: " + generateBinaryStringsIterative(n));

        // Call Recursive Version
        generateBinaryStringsRecursive(n, "");
        System.out.println("Recursive result: " + result);
    }
    
    private static List<String> generateBinaryStringsIterative(int n) {
        List<String> result = new ArrayList<>();
        int total = 1 << n;
        for(int i = 0; i < total; i++) {
            String binary = Integer.toBinaryString(i);
            String padded = "0".repeat(n - binary.length()) + binary;
            result.add(padded);
        }
        return result;
    }

    public static void generateBinaryStringsRecursive(int n, String prefix) {
        if (n == 0) {
            result.add(prefix);
            return;
        }
        // Append '0' and recurse
        generateBinaryStringsRecursive(n - 1, prefix + "0");
        // Append '1' and recurse
        generateBinaryStringsRecursive(n - 1, prefix + "1");
    }
}
