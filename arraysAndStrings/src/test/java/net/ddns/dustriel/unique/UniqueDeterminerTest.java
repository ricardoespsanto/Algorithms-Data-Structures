package net.ddns.dustriel.unique;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Testing three implementations
 */
public class UniqueDeterminerTest {

    private UniqueDeterminer setUniqueDeterminer;

    private UniqueDeterminer hashUniqueDeterminer;

    private UniqueDeterminer noDataStructureUniqueDeterminer;

    @Before
    public void setUp() throws Exception {
        setUniqueDeterminer = new SetUniqueDeterminer();
        hashUniqueDeterminer = new HashMapUniqueDeterminer();
        noDataStructureUniqueDeterminer = new NoDataStructureUniqueDeterminer();
    }

    @Test
    public void isUniqueReturnsFalseIfDuplicatedCharacters() {
        Assert.assertFalse(setUniqueDeterminer.isUnique("aa"));
        Assert.assertFalse(hashUniqueDeterminer.isUnique("aa"));
        Assert.assertFalse(noDataStructureUniqueDeterminer.isUnique("aa"));
    }

    @Test
    public void isUniqueReturnsTrueIfNoDuplicateCharactersAreFound() {
        Assert.assertTrue(setUniqueDeterminer.isUnique("ab"));
        Assert.assertTrue(hashUniqueDeterminer.isUnique("ab"));
        Assert.assertTrue(noDataStructureUniqueDeterminer.isUnique("ab"));
    }

    @Test
    public void isUniqueReturnsTrueOnEmptyString() {
        Assert.assertTrue(setUniqueDeterminer.isUnique(""));
        Assert.assertTrue(hashUniqueDeterminer.isUnique(""));
        Assert.assertTrue(noDataStructureUniqueDeterminer.isUnique(""));
    }

}
