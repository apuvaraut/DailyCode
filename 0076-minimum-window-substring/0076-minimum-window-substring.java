class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // Count characters of t
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            // Add character to window
            window.put(c, window.getOrDefault(c, 0) + 1);

            // Check whether current window contains all required characters
            while (containsAll(need, window)) {

                int length = right - left + 1;

                // Save smallest window
                if (length < minLength) {
                    minLength = length;
                    start = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }

    private boolean containsAll(
            HashMap<Character, Integer> need,
            HashMap<Character, Integer> window) {

        for (char c : need.keySet()) {

            if (window.getOrDefault(c, 0) < need.get(c)) {
                return false;
            }
        }

        return true;
    }
}