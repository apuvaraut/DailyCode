class Solution {
    public String longestCommonPrefix(String[] strs) {

String prefix=strs[0];
for(int right=1;right<strs.length;right++){
while(!strs[right].startsWith(prefix)){
    prefix=prefix.substring(0,prefix.length()-1);
     if (prefix.isEmpty()) {
                    return "";
                }
}


}


return prefix;










        
    }
}