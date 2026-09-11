class Solution {
    public int countValidSelections(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int left = 0;
                int right = 0;
                for (int j = 0; j < i; j++) {
                    left += nums[j];
                }
                for (int j = i + 1; j < nums.length; j++) {
                    right += nums[j];
                }
                if (left == right) {
                    ans += 2;
                } 
                else if (Math.abs(left - right) == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }
}