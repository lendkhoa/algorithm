package algorithm.arrays;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add the current string to the corresponding anagram list
            anagramMap.putIfAbsent(sortedStr, new ArrayList<>());
            anagramMap.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagramMap.values()); 
    }
}
