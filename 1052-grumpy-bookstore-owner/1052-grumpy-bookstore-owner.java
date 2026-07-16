class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int satisfied = 0;

        // Step 1: Customers already satisfied
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                satisfied += customers[i];
            }
        }

        // Step 2: Extra customers in the first window
        int extra = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
        }

        int maxExtra = extra;

        // Step 3: Slide the window
        for (int i = minutes; i < customers.length; i++) {

            // Remove the leftmost minute if it was grumpy
            if (grumpy[i - minutes] == 1) {
                extra -= customers[i - minutes];
            }

            // Add the new minute if it is grumpy
            if (grumpy[i] == 1) {
                extra += customers[i];
            }

            maxExtra = Math.max(maxExtra, extra);
        }

        // Step 4: Final answer
        return satisfied + maxExtra;
    }
}