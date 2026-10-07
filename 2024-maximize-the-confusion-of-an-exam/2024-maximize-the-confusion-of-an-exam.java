class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        int ansT = maxWindow(answerKey, k, 'F');
        int ansF = maxWindow(answerKey, k, 'T');
        
        return Math.max(ansT, ansF);
    }

    public int maxWindow(String s, int k, char ch) {
        int left = 0;
        int count = 0;
        int maxcount = 0;

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) == ch) {
                count++;
            }

            while (count > k) {
                if (s.charAt(left) == ch) {
                    count--;
                }
                left++;
            }

            maxcount = Math.max(maxcount, right - left + 1);
        }

        return maxcount;
    }
}