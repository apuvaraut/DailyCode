class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
        }
        int maxcount=count;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='W'){
                count--;
            }
              if(blocks.charAt(i)=='W'){
                count++;
            }
            maxcount=Math.min(maxcount,count);
        }
        return maxcount;
    }
}