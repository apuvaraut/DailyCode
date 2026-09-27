class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        
        for(int fast=nums.length-1;fast>=2;fast--){
            int slow=0;
            int middle=fast-1;
            while(slow<middle){
            if(nums[slow]+nums[middle]>nums[fast]){
                count=count+middle-slow;
                middle--;
            }else{
                slow++;
            }
            
        }}
        return count;
    }
}