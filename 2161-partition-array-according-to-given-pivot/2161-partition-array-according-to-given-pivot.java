class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int[] ans = new int[nums.length];

        int index = 0;

        // 1. Put smaller elements
        for (int num : nums) {
            if (num < pivot) {
                ans[index] = num;
                index++;
            }
        }

        // 2. Put equal elements
        for (int num : nums) {
            if (num == pivot) {
                ans[index] = num;
                index++;
            }
        }

        // 3. Put greater elements
        for (int num : nums) {
            if (num > pivot) {
                ans[index] = num;
                index++;
            }
        }

        return ans;
    }
}