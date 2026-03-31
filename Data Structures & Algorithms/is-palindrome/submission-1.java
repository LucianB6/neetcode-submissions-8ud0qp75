class Solution {
    public boolean isPalindrome(String s) {
        // let's remove the spaces and make, punctuation and upper cases.
        String entireValue = s.trim();
        entireValue = entireValue.toLowerCase();
        entireValue = entireValue.replaceAll("[^a-zA-Z0-9]", "");

        String reversedValue = "";

        for (int i = entireValue.length() - 1; i >= 0; i--){
            reversedValue += entireValue.charAt(i);
        }

        if (reversedValue.equals(entireValue)){
            return true;
        }
        return false;
    }
}
