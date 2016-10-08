package net.ddns.dustriel.permutations;

import java.util.Arrays;

/**
 * A simple approach that will sort both arrays of characters and then iterate one looking for an equal character on
 * the other
 */
class SortedCharsPermutationIdentifier implements PermutationIdentifier {

    @Override
    public boolean arePermutationsOfEachOther(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        Arrays.sort(aChars);
        Arrays.sort(bChars);

        return areCharArraysEqual(aChars, bChars);
    }

    private boolean areCharArraysEqual(char[] aChars, char[] bChars) {
        for (int i = 0; i < aChars.length; i++) {
            if (aChars[i] != bChars[i]) {
                return false;
            }
        }
        return true;
    }
}
