class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(String str : arr){
            StringBuilder temp = new StringBuilder(str);
            temp.reverse();
            sb.append(temp);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}