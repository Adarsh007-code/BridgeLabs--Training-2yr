import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class LC500 {
    public String[] findWords(String[] words) {
        Map<Character, Integer> charRowMap = new HashMap<>();
        updateRowMap(charRowMap, "qwertyuiop", 1);
        updateRowMap(charRowMap, "asdfghjkl", 2);
        updateRowMap(charRowMap, "zxcvbnm", 3);

        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (word.isEmpty()) continue;
            int initialRow = charRowMap.get(Character.toLowerCase(word.charAt(0)));
            boolean inSameRow = true;
            for (char c : word.toCharArray()) {
                if (charRowMap.get(Character.toLowerCase(c)) != initialRow) {
                    inSameRow = false;
                    break;
                }
            }
            if (inSameRow) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
    private void updateRowMap(Map<Character, Integer> map, String rowChars, int rowIdx) {
        for (char c : rowChars.toCharArray()) {
            map.put(c, rowIdx);
        }
    }
}