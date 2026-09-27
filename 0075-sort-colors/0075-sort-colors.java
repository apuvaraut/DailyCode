class Solution {
    public void sortColors(int[] nums) {
        int slow=0;
        int fast=nums.length-1;
        int middle=0;

    while(middle<=fast){
        if(nums[middle]==0){
             int temp = nums[slow];
                nums[slow] = nums[middle];
                nums[middle] = temp;
middle++;
            slow++;
        }else if(nums[middle]==2){
           
              int temp = nums[middle];
                nums[middle] = nums[fast];
                nums[fast] = temp;
                fast--;

        }else{
            middle++;
        }






    }
        


       





                                   
   



    }
}


