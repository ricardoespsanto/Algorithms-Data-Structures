package net.ddns.dustriel.permutations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ricardo on 08/10/2016.
 */
public class XORPermutationIdentifierTest {

    private XORPermutationIdentifier xorPermutationIdentifier;

    @Before
    public void setUp() {
        xorPermutationIdentifier = new XORPermutationIdentifier();
    }

    @Test
    public void arePermutationsOfEachOther() {
        Assert.assertFalse(xorPermutationIdentifier.arePermutationsOfEachOther("xvy", "abc"));
        Assert.assertTrue(xorPermutationIdentifier.arePermutationsOfEachOther("bac", "abc"));
    }

}
