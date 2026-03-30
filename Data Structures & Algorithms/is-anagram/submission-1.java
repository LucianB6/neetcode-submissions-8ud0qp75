class Solution {
    public boolean isAnagram(String s, String t) {
        // let's push all s into a stackabstract

        HashMap<Character, Integer> firstString = new HashMap(); 
        HashMap<Character, Integer> secondString = new HashMap(); 
        if (s.length() != t.length()){
            return false;
        }
        for ( int i = 0; i < s.length(); i++ ){
            if ( firstString.containsKey(s.charAt(i)) ){
                int myCurrentValue = firstString.get(s.charAt(i));
                firstString.put(s.charAt(i), myCurrentValue + 1);
            }

            else {
                firstString.put(s.charAt(i), 0);
            }
        }

        for ( int i = 0; i < t.length(); i++ ){
            if ( secondString.containsKey(t.charAt(i)) ){
                int myCurrentValue = secondString.get(t.charAt(i));
                secondString.put(t.charAt(i), myCurrentValue + 1);
            }

            else {
                secondString.put(t.charAt(i), 0);
            }
        }

        for (Character key : firstString.keySet()){
            if (!secondString.containsKey(key)){
                return false;
            }
            else {
                int value1 = firstString.get(key);
                int value2 = secondString.get(key);

                if ( value1 == value2 ){
                    continue;
                }
                else return false;
            }
        }
        return true;
    }
}
