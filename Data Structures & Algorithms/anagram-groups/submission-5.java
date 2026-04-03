class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();

        for(String word: strs){
            char [] char_words = word.toCharArray();
            Arrays.sort(char_words);
            String sorted_word = new String(char_words);
            if(anagram.containsKey(sorted_word)){
                anagram.get(sorted_word).add(word);
            }
            else{
                List<String> newlist = new ArrayList<>();
                newlist.add(word);
                anagram.put(sorted_word, newlist);
            }
        }
        return new ArrayList<>(anagram.values());
    }
}
