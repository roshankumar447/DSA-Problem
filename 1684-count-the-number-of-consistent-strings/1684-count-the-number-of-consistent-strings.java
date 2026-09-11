class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        for (String word : words) {
            boolean ok = true;
            for (char ch : word.toCharArray()) {
                if (allowed.indexOf(ch) == -1) {
                    ok = false;
                    break;
                }
            }
            if (ok) ans++;
        }
        return ans;
    }
}