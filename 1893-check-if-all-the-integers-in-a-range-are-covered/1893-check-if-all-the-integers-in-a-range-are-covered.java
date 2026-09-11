class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] count = new int[52];
        for (int[] range : ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                count[i]++;
            }
        }
        for (int i = left; i <= right; i++) {
            if (count[i] == 0) {
                return false;
            }
        }
        return true;
    }
}