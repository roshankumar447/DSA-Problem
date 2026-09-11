class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            int n = num;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    set.add(i);
                    while (n % i == 0) {
                        n /= i;
                    }
                }
            }
            if (n > 1) {
                set.add(n);
            }
        }
        return set.size();
    }
}