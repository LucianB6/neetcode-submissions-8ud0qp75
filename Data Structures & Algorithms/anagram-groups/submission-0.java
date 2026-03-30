class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramCounter = new HashMap<>();

        for (String s: strs){

            int[] freq = new int[26];

            for ( char c : s.toCharArray()) {
                freq [c - 'a'] ++;
            }

            String key = Arrays.toString(freq);

            anagramCounter.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(anagramCounter.values());
    }
}
