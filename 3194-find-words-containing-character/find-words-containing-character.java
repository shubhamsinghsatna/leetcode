class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<Integer>();
        int point=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(x==words[i].charAt(j)){
                    ans.add(point);
                    break;
                }
            }
            point++;
        }
        return ans;
    }
}