class KpalindromeStrings {

    public boolean canConstruct(String s, int k) {
        if (k > s.length()) return false;

        int mask = 0;
        for (char c : s.toCharArray()) {
            mask ^= 1 << (c - 'a'); // toggle bit for character
        }

        int oddCount = Integer.bitCount(mask);
        return oddCount <= k;
    }
}
