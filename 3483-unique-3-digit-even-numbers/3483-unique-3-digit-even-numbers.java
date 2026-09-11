class Solution {
    public int totalNumbers(int[] digits) {
        int ans = 0;
        for (int num = 100; num <= 999; num += 2) {
            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;
            int[] count = new int[10];
            for (int d : digits) {
                count[d]++;
            }
            if (count[a] > 0) {
                count[a]--;
            } else {
                continue;
            }
            if (count[b] > 0) {
                count[b]--;
            } else {
                continue;
            }
            if (count[c] > 0) {
                ans++;
            }
        }
        return ans;
    }
}