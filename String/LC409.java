class LC409 {
    public int longestPalindrome(String s) {
        int[] charCounts = new int[128];
        for (char c : s.toCharArray()) {
            charCounts[c]++;
        }
        int length = 0;
        boolean oddFound = false;
        for (int count : charCounts) {
            length += (count / 2) * 2;
            if (count % 2 == 1) {
                oddFound = true;
            }
        }
        return oddFound ? length + 1 : length;
    }
}