class LC414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int thirdmax = nums.length - 1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] != nums[i+1]){
                count++;
                thirdmax = nums[i];
                if(count == 3){
                    return thirdmax;
                }
            }
        }
        return nums[nums.length - 1];
    }
}