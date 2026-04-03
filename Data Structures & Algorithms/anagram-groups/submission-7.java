class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();

        for(String word: strs){
            char [] char_word = word.toCharArray();
            Arrays.sort(char_word);
            String sorted_word = new String(char_word);

            List<String> newlist = new ArrayList<>();
            if(anagram.containsKey(sorted_word)){
                anagram.get(sorted_word).add(word);
            }else{
                newlist.add(word);
                anagram.put(sorted_word, newlist);
                
            }
        }
        return new ArrayList<>(anagram.values());
    }
}
