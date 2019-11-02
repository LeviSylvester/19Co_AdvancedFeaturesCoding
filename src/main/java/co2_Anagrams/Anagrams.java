package co2_Anagrams;

import java.util.HashMap;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(areAnagrams("SILENT", "LISTEN"));
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return false;
        }

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        HashMap<Character, Integer> mapString1 = new HashMap<>();
        HashMap<Character, Integer> mapString2 = new HashMap<>();

        for (char c : charArray1) {
//            if (mapString1.get(c) == null)
            if (mapString1.containsKey(c)) {
                mapString1.put(c, mapString1.get(c) + 1);
            } else {
                mapString1.put(c, 1);
            }
        }
        for (int i = 0; i < charArray1.length; i++) {
//            if (mapString2.containsKey(charArray2[i])) {
//                mapString2.put(charArray2[i], mapString2.get(charArray2[i] + 1));
//            } else {
//                mapString2.put(charArray2[i], 1);
//            }
//        }
            if (mapString2.containsKey(charArray2[i])) {
                mapString2.put(charArray2[i], mapString2.get(charArray2[i] - 1));
            } else if (mapString2.get(charArray2[i]) == 0) {
                mapString2.remove(charArray2[i]);
            }
//            } else return false;
        }
        return mapString1.isEmpty();
    }
}

