package net.ddns.dustriel.unique;

import java.util.Arrays;

/**
 * This particular implementation uses only the character array that the string represents. After a sorting of that
 * array each character is compared to the next in line and if they are equal we know we've found a duplicate.
 */
class NoDataStructureUniqueDeterminer implements UniqueDeterminer {

    @Override
    public boolean isUnique(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i+=2) {
            if (chars[i] == chars[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
