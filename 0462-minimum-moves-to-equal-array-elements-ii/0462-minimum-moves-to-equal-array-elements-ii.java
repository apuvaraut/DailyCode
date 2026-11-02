class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int mid = nums.length / 2;
        for(int i=0;i<nums.length;i++){
          
          if(nums[i]!=nums[mid]){
            sum=sum+Math.abs(nums[mid]-nums[i]);
          }
        }
        return sum;
    }
}