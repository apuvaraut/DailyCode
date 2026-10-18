class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
int diff=0;
diff = nums[k - 1] - nums[0];
int mindiff=diff;
for(int i=k;i<nums.length;i++){

    diff=nums[i]-nums[i-k+1];
    mindiff=Math.min(diff,mindiff);
}

        return mindiff;
    }
}