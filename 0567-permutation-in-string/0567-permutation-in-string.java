class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
       int [] freq=new int[26];
       int window[]=new int[26];
       for(char ch:s1.toCharArray()){
        freq[ch-'a']++;
        
       }
       int left=0;
       int k=s1.length();
       for(int right=0;right<s2.length();right++){
             window[s2.charAt(right)-'a']++;

             if(right-left+1>k){
                window[s2.charAt(left)-'a']--;
                left++;
             }
             if(right-left+1==k){
                  if (Arrays.equals(window, freq)) {
        return true;
    }
             }
       }
 return false;
    }
}