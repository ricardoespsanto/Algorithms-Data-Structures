package net.ddns.dustriel.unique;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Testing four implementations
 */
public class UniqueDeterminerTest {

    private UniqueDeterminer setUniqueDeterminer;

    private UniqueDeterminer hashUniqueDeterminer;

    private UniqueDeterminer noDataStructureUniqueDeterminer;

    private IndexOfUniqueDeterminer indexOfUniqueDeterminer;

    @Before
    public void setUp() throws Exception {
        setUniqueDeterminer = new SetUniqueDeterminer();
        hashUniqueDeterminer = new HashMapUniqueDeterminer();
        noDataStructureUniqueDeterminer = new NoDataStructureUniqueDeterminer();
        indexOfUniqueDeterminer = new IndexOfUniqueDeterminer();
    }

    @Test
    public void isUniqueReturnsFalseIfDuplicatedCharacters() {
        Assert.assertFalse(setUniqueDeterminer.isUnique("aa"));
        Assert.assertFalse(hashUniqueDeterminer.isUnique("aa"));
        Assert.assertFalse(noDataStructureUniqueDeterminer.isUnique("aa"));
        Assert.assertFalse(indexOfUniqueDeterminer.isUnique("aa"));
    }

    @Test
    public void isUniqueReturnsTrueIfNoDuplicateCharactersAreFound() {
        Assert.assertTrue(setUniqueDeterminer.isUnique("ab"));
        Assert.assertTrue(hashUniqueDeterminer.isUnique("ab"));
        Assert.assertTrue(noDataStructureUniqueDeterminer.isUnique("ab"));
        Assert.assertTrue(indexOfUniqueDeterminer.isUnique("ab"));
    }

    @Test
    public void isUniqueReturnsTrueOnEmptyString() {
        Assert.assertTrue(setUniqueDeterminer.isUnique(""));
        Assert.assertTrue(hashUniqueDeterminer.isUnique(""));
        Assert.assertTrue(noDataStructureUniqueDeterminer.isUnique(""));
        Assert.assertTrue(indexOfUniqueDeterminer.isUnique(""));
    }

}
