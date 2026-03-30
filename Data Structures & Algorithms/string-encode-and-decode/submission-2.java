class Solution {

    public String encode(List<String> strs) {

        String encodedValues = "";

        for (String s : strs){
            int sizeOfString = s.length();
            String delimiterSymbol = "#";

            encodedValues += Integer.toString(sizeOfString);
            encodedValues += delimiterSymbol;
            encodedValues += s;
        }

        return encodedValues;

    }

    public List<String> decode(String str) {

        List<String> decodedList = new ArrayList<>();

        int index = 0;
        int declaredSize = 0;
        String previousValue = "";
        
        for (int i = 0; i < str.length(); i++) {
            
            if (Character.isDigit(str.charAt(i))){
                
                declaredSize = declaredSize * 10 + (str.charAt(i) - '0');
            }
            
            else if ( str.charAt(i) == '#' ){
                String value = "";
                value += str.substring(i + 1, (i + declaredSize + 1));
                decodedList.add(value);
                int nextStop = i + declaredSize;
                declaredSize = 0;

                if (nextStop >= str.length()) {
                    break;
                }
                else {
                    i = nextStop;
                }
            }

            previousValue = Character.toString(str.charAt(i));
            index += 1;
        }

        return decodedList;
    }
}
