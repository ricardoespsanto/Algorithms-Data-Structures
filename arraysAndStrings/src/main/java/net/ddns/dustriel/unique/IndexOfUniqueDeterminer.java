package net.ddns.dustriel.unique;

/**
 * This implementation will use another string as a data structure and will make use of the indexOf String method to
 * look for duplicate characters
 */
class IndexOfUniqueDeterminer implements UniqueDeterminer {

    @Override
    public boolean isUnique(String string) {
        String reconstructedString = "";
        for (int i = 0; i < string.length(); i++) {
            char characterToLookFor = string.charAt(i);
            if (isCharacterPresentInString(characterToLookFor, reconstructedString)) {
                return false;
            }

            reconstructedString += Character.toString(characterToLookFor);
        }
        return true;
    }

    private boolean isCharacterPresentInString(char c, String string) {
        return string.indexOf(c) != -1;
    }
}
