package net.ddns.dustriel.unique;

import java.util.HashMap;
import java.util.Map;

/**
 * This particular implementation uses a HashMap to store each character on that string so it naturally has to iterate
 * through potentially n elements n-1 times before it fails
 */
class HashMapUniqueDeterminer implements UniqueDeterminer {

    @Override
    public boolean isUnique(String string) {
        Map<Character, Integer> characterMap = new HashMap<>(string.length());
        for (Character character : string.toCharArray()) {
            if (characterMap.containsKey(character)) {
                return false;
            }
            characterMap.put(character, characterMap.get(character));
        }
        return true;
    }
}
