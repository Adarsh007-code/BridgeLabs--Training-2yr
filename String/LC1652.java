class LC1652 {
    public int[] decrypt(int[] code, int k) {
       int n = code.length;
       int []result = new int[n];
       for(int i=0;i<n;i++){
        for(int j=1;j<=Math.abs(k);j++){
            if(k > 0){
                result[i] += code[(i+j) % n];
            }else{
                result[i] += code[(i-j+n) % n];
                }
            }
       }
       return result;
    }
}