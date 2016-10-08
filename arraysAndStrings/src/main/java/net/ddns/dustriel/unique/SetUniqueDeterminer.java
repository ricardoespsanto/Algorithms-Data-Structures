package net.ddns.dustriel.unique;

import java.util.HashSet;
import java.util.Set;

/**
 * This particular implementation has to iterate through n characters until it finds a duplicate and then it will fail
 * fast.
 */
class SetUniqueDeterminer implements UniqueDeterminer {

    @Override
    public boolean isUnique(String string) {
        Set<Character> characterSet = new HashSet<>(string.length());
        for (Character character : string.toCharArray()) {
            boolean added = characterSet.add(character);
            if (!added) {
                return false;
            }
        }
        return true;
    }
}
