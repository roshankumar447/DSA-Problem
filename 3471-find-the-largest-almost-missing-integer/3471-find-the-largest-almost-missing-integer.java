class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[51];
        for (int x : nums) {
            count[x]++;
        }
        if (k == n) {
            for (int i = 50; i >= 0; i--) {
                if (count[i] > 0) {
                    return i;
                }
            }
        }
        if (k == 1) {
            for (int i = 50; i >= 0; i--) {
                if (count[i] == 1) {
                    return i;
                }
            }
        }
        for (int i = 50; i >= 0; i--) {
            if (count[i] == 1 &&
                (nums[0] == i || nums[n - 1] == i)) {
                return i;
            }
        }
        return -1;
    }
}