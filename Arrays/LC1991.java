class LC1991 {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        int leftsum = 0;
        int rightsum = 0;
        for(int i=0;i<nums.length;i++){
             rightsum = sum - leftsum - nums[i];
            if(leftsum == rightsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}