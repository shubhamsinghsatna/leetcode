class Solution {
    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> charCountWord1 = new HashMap<>();
        Map<Character, Integer> charCountWord2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            charCountWord1.merge(word1.charAt(i), 1, Integer::sum);
            charCountWord2.merge(word2.charAt(i), 1, Integer::sum);
        }
        
        List<Integer> numberOfRepetitions1 = new ArrayList<>();
        List<Integer> numberOfRepetitions2 = new ArrayList<>();
        
        charCountWord1.forEach((key, value) -> numberOfRepetitions1.add(value));
        charCountWord2.forEach((key, value) -> numberOfRepetitions2.add(value));
        
        Collections.sort(numberOfRepetitions1);
        Collections.sort(numberOfRepetitions2);

        return numberOfRepetitions1.equals(numberOfRepetitions2) &&
         charCountWord1.keySet().containsAll(charCountWord2.keySet()) && 
         charCountWord2.keySet().containsAll(charCountWord1.keySet());
    }
}