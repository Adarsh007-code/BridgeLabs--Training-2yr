class LC283 {
public:
    void moveZeroes(vector<int>& nums) {
        int n = nums.size();
        vector<int> temp(n);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }

        int i = 0, j = 0;
        while (i < n) {
            if (nums[i] != 0) {
                temp[j] = nums[i];
                j++;
            }
            i++;
        }
        while (count--) {
            temp[j] = 0;
            j++;
        }
        nums = temp;
    }
};