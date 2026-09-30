class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int[] freqP = new int[26];
        int[] freqWindow = new int[26];

        // Frequency of p
        for (char ch : p.toCharArray()) {
            freqP[ch - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            freqWindow[s.charAt(right) - 'a']++;

            // Window size should be p.length()
            if (right - left + 1 > p.length()) {
                freqWindow[s.charAt(left) - 'a']--;
                left++;
            }

            // Check anagram
            if (right - left + 1 == p.length()
                    && Arrays.equals(freqP, freqWindow)) {

                ans.add(left);
            }
        }

        return ans;
    }
}