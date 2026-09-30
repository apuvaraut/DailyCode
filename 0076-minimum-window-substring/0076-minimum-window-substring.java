class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>(); 
        HashMap<Character, Integer> window = new HashMap<>();
        int left=0;
        int right=0;
        int formed=0;
        
        int minlength = Integer.MAX_VALUE;
        int start=0;

    for(char num:t.toCharArray()){
        need.put(num,need.getOrDefault(num,0)+1);
    }
    int required = need.size();

        while(right<s.length()){
          char ch=s.charAt(right);
   window.put(ch,window.getOrDefault(ch,0)+1);
    if(need.containsKey(ch)&& window.get(ch).intValue()==need.get(ch).intValue()){
        formed++;
    }
while(formed==required){
  if (right - left + 1 < minlength) {
    minlength = right - left + 1;
    start = left;
}
   // Remove left character
                char leftChar = s.charAt(left);

                window.put(leftChar, window.get(leftChar) - 1);

if(need.containsKey(leftChar)
    && window.get(leftChar) < need.get(leftChar)){
    formed--;
}
left++;
}
right++;

}
 if (minlength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minlength);
}
}