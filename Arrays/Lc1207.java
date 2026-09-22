class Lc1207 {
    public boolean uniqueOccurrences(int[] arr) {
        int a = arr.length;
        int []freq = new int[2001];
        for(int n : arr){
            freq[n+1000]++;
        }
        for(int i=0;i<2001;i++){
            for(int j=i+1;j<2001;j++){
                if(freq[i]!=0 && freq[j] == freq[i]){
                    return false;
                }
            }
        }
        return true;
    }
}