class Lc645 {
    public int[] findErrorNums(int[] nums) {
        int freq[] = new int[nums.length+1];
        for(int n : nums){
            freq[n]++;
        }
        int duplicate = 0;
        int missing = 0;
        for(int i=1;i<=nums.length;i++){
            if(freq[i] == 2){
                duplicate = i;
            }
            if(freq[i] == 0){
                missing = i;
            }
        }
        return new int[]{duplicate,missing};
    }
}