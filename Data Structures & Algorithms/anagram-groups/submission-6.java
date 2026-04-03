class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagrams = new HashMap<>();

        for(String word: strs){
            char [] word_array = word.toCharArray();
            Arrays.sort(word_array);
            String sorted_word = new String(word_array);
            if(anagrams.containsKey(sorted_word)){
                anagrams.get(sorted_word).add(word);
            }
            else{
                List<String>newlist = new ArrayList<>();
                newlist.add(word);
                anagrams.put(sorted_word, newlist);
            }
        }
        return new ArrayList<>(anagrams.values());
    }
}
