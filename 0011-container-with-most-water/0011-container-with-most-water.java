class Solution {
    public int maxArea(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int ans = 0;

        while (l < r) {
            int area = Math.min(arr[l], arr[r]) * (r - l);
            ans = Math.max(ans, area);

            if (arr[l] > arr[r]) {
                r--;
            } else {
                l++;
            }
        }

        return ans;
    }
}