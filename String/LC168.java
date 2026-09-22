class LC168 {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        while (columnNumber > 0) {
            columnNumber--;
            int rem = columnNumber % 26;
            char ch = (char) ('A' + rem);
            ans = ch + ans;
            columnNumber = columnNumber / 26;
        }
        return ans;
    }
    
}