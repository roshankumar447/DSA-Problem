class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int a = 0, b = 0;
        for (int i = 0; i < mid; i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1)
                a++;
        }
        for (int i = mid; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1)
                b++;
        }
        return a == b;
    }
}