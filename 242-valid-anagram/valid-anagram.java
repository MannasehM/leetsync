import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {


        if (s.length() != t.length()) {
            return false;
        }


        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);


            if (sMap.get(charS) != null) {
                sMap.put(charS, sMap.get(charS) + 1);
            }
            else {
                sMap.put(charS, 0);
            }


            if (tMap.get(charT) != null) {
                tMap.put(charT, tMap.get(charT) + 1);
            }
            else {
                tMap.put(charT, 0);
            }
        }
        return sMap.equals(tMap);
    }
}
