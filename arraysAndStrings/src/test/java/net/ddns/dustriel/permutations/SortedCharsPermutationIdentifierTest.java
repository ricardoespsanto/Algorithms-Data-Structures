package net.ddns.dustriel.permutations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ricardo on 08/10/2016.
 */
public class SortedCharsPermutationIdentifierTest {

    private SortedCharsPermutationIdentifier sortedCharsPermutationIdentifier;

    @Before
    public void setUp() {
        sortedCharsPermutationIdentifier = new SortedCharsPermutationIdentifier();
    }

    @Test
    public void arePermutationsOfEachOther() {
        Assert.assertTrue(sortedCharsPermutationIdentifier.arePermutationsOfEachOther("abc", "bac"));
        Assert.assertFalse(sortedCharsPermutationIdentifier.arePermutationsOfEachOther("zxy", "abc"));
    }

}
