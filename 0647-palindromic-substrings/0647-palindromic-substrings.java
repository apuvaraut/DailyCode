class Solution {
    public int countSubstrings(String s) {

        int left = 0;
        int count = 0;

        for (left = 0; left < s.length(); left++) {

            for (int right = left; right < s.length(); right++) {

                if (isPalindrome(s, left, right)) {
                    count++;
                }
            }
        }

        return count;
    }

    static boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
