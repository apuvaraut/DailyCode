class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int count=0;
      for(int i=0;i<customers.length;i++){
        if(grumpy[i]==0){
            count=count+customers[i];
        }
      }
int left=0;
int cc=0;
int maxcc=0;
for(int right=0;right<customers.length;right++){

    if(grumpy[right]==1){
        cc=cc+customers[right];
    }

   
        while(right-left+1>minutes){
        if(grumpy[left]==1){
        cc=cc-customers[left];
    }

        
        
         left++;
        }
        
         maxcc=Math.max(cc,maxcc);
    }
   
    return maxcc+count;
}



 
}