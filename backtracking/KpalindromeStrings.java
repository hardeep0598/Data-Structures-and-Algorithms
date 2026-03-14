class KpalindromeStrings {

    public boolean canConstructWithBitMasking(String s, int k) {
        if (k > s.length()) return false;

        int mask = 0;
        for (char c : s.toCharArray()) {
            mask ^= 1 << (c - 'a'); // toggle bit for character
        }

        int oddCount = Integer.bitCount(mask);
        return oddCount <= k;
    }

    public boolean canConstruct(String s, int k) {
        if (k > s.length()) return false;
        if (k == s.length()) return true;

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 == 1) oddCount++;
        }

        return oddCount <= k;
    }
}
