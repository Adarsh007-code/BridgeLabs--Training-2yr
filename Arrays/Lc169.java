class Lc169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int numbers= 0;
        for (int num : nums) {
            if (count == 0) {
                numbers = num;
            }
            if (num == numbers) {
                count++;
            } else {
                count--;
            }
        }
        return numbers;
    }
}