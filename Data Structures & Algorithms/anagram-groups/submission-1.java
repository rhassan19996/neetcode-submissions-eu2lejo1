class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();

        for(String word : strs){
            char [] charword = word.toCharArray();
            Arrays.sort(charword);
            String sortedword = new String(charword);

            if(anagram.containsKey(sortedword)){
                anagram.get(sortedword).add(word);
            }
            else{
                List<String> newlist = new ArrayList<>();
                newlist.add(word);
                anagram.put(sortedword, newlist);
            }
        }
        return new ArrayList<>(anagram.values());
    }
}