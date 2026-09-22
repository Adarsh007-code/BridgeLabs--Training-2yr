class LC1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String str1 : word1){
            sb1.append(str1);
        }
        for(String str2 : word2){
            sb2.append(str2);
        }
        return sb1.toString().equals(sb2.toString());
    }
}