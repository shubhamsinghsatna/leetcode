class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=0;
        if(s.length()==0){
            return true;
        }
        for(int i=0;i<t.length();i++){
            if(a<s.length() && s.charAt(a)==t.charAt(i)){
                a++;
            }
        }
        if(a==s.length()){
            return true;
        }
        return false;
    }
}