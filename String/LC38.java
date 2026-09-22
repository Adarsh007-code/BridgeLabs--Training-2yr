class LC38 {
    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 0; j < result.length(); j++) {
                if (j + 1 < result.length() && result.charAt(j) == result.charAt(j + 1)) {
                    count++;
                } else {
                    sb.append(count).append(result.charAt(j));
                    count = 1;
                }
            }   
            result = sb.toString();
        }
        return result;
    }
}