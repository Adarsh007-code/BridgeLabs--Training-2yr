class LC167 {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int ends = numbers.length-1;
        while(start < ends){
            if(numbers[start] + numbers[ends] == target){
                return new int[]{start+1, ends+1};
            }else if(numbers[start] + numbers[ends] > target){
                ends--;
            }else{
                start++;
            }
        }
        return new int[]{-1, -1};
    }
}