import java.util.Arrays;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        
        for (int i = 0; i < strs.length; i++) {
            String sortedKey = sortString(strs[i]);
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<String>());
                map.get(sortedKey).add(strs[i]);
            }
            else {
                map.get(sortedKey).add(strs[i]);
            }
        }
        List<List<String>> result = new ArrayList<List<String>>();
        for (List<String> list: map.values()) {
            result.add(list);
        }
        return result;
    }
    public String sortString (String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}