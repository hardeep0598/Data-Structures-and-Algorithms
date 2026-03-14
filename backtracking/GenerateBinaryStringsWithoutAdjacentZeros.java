package backtracking;

import java.util.*;

public class GenerateBinaryStringsWithoutAdjacentZeros {

  private static List<String> result = new ArrayList<>();
    
    public static void main(String[] args) {
        int n = 2;

        // Call Recursive Version
        generateBinaryStringsWithoutAdjacentZerosRecursive(n, "");
        System.out.println("Recursive result: " + result);
    }

  public static void generateBinaryStringsWithoutAdjacentZerosRecursive(int n, String prefix, char lastChar) {
        if (n == 0) {
            result.add(prefix);
            return;
        }
    
        // Option 1: Put '1' (always allowed)
        generateBinaryStringsRecursive(n - 1, prefix + "1", '1');

        // Option 2: Put '0' (only if lastChar is not '0')
        if (lastChar != '0') {
            generateBinaryStringsRecursive(n - 1, prefix + "0", '0');
        }
    }
}
