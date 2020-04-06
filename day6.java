class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int i, j, k = 0;
        List<List<String>> anagrams = new ArrayList<List<String>>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        //Arrays.sort(strs);
        for (String s : strs) {
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            String sortedWord = new String(letters);
            
            if (map.containsKey(sortedWord)) {
                map.get(sortedWord).add(s);
            }
            else {
                ArrayList<String> words = new ArrayList<String>();
                words.add(s);
                map.put(sortedWord, words);
            }
        }
        anagrams.addAll(map.values());
        return anagrams;
    }
}
