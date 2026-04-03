class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for(String word : strs){
            char [] wordChar = word.toCharArray();
            Arrays.sort(wordChar);
            String sortedWord = new String(wordChar);

            if(anagrams.containsKey(sortedWord)){
                anagrams.get(sortedWord).add(word);
            }
            else{
                List<String> newlist = new ArrayList<>();
                newlist.add(word);
                anagrams.put(sortedWord, newlist);
            }

        }
        return new ArrayList<>(anagrams.values());
    }
}
