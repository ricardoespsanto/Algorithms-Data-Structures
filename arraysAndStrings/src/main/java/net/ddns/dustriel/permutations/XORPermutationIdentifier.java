package net.ddns.dustriel.permutations;

/**
 * Created by ricardo on 08/10/2016.
 */
class XORPermutationIdentifier implements PermutationIdentifier {

    @Override
    public boolean arePermutationsOfEachOther(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }

        int result = 0;
        for (int i = 0; i < a.length(); i++) {
            int charAValue = (int) a.charAt(i);
            int charBValue = (int) b.charAt(i);

            result = result ^ charAValue;
            result = result ^ charBValue;
        }

        return result == 0;
    }
}
