class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int zeroc=0;
        int Max=0;
for(int i=0;i<nums.length;i++){
    if(nums[i]==0){
        zeroc++;
    }
    while(zeroc>k){
        if(nums[left]==0){
            zeroc--;
        }
        left++;
    }
    Max=Math.max(Max,i-left+1);
}
return Max;
        
    }
}