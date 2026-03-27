package com.program;

import java.util.*;

public class GroupAnagram {

	public static void main(String[] args) {
String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        // Step 2: Create a HashMap
        // Key = sorted characters (e.g., "aet")
        // Value = List of anagrams (e.g., ["eat", "tea", "ate"])
        Map<String, List<String>> map = new HashMap<>();
        
        // Step 3: Process each word
        for (String word : words) {
            System.out.println("\n--- Processing: " + word + " ---");
            
            // Step 4: Convert word to character array
            char[] ch = word.toCharArray();
            System.out.println("Characters: " + Arrays.toString(ch));
            
            // Step 5: Sort the characters alphabetically
            Arrays.sort(ch);
            System.out.println("Sorted: " + Arrays.toString(ch));
            
            // Step 6: Convert sorted chars back to String (this is our key)
            String key = new String(ch);
            System.out.println("Key: " + key);
            
            // Step 7: Check if key exists in map
            if (!map.containsKey(key)) {
                // If not, create new empty list
                map.put(key, new ArrayList<>());
                System.out.println("Created new list for key: " + key);
            }
            
            // Step 8: Add current word to the list
            map.get(key).add(word);
            System.out.println("Added '" + word + "' to group");
            System.out.println("Current map: " + map);
        }
        
        // Step 9: Print all groups (only the values, not the keys)
        System.out.println("\n=== FINAL RESULT ===");
        System.out.println(map.values());
    }
}
