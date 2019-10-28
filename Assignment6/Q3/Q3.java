package Q3;

import java.util.HashMap;

public class Q3 {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for(char c : t.toCharArray()) {
            if(map.containsKey(c)) {
                if(map.get(c) == 1) {
                    map.remove(c);
                } else {
                    map.put(c, map.get(c) - 1);
                }
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "cat";
        String t = "rat";
        System.out.println(isAnagram(s, t));
    }
}
