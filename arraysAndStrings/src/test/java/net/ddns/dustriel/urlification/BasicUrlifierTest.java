package net.ddns.dustriel.urlification;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ricardo on 08/10/2016.
 */
public class BasicUrlifierTest {

    private Urlifier urlifier;

    @Before
    public void setUp() throws Exception {
        urlifier = new BasicUrlifier();
    }

    @Test
    public void urlify() throws Exception {
        String urlifiedString = urlifier.urlify("Mr John Smith    ");
        Assert.assertEquals("Mr%20John%20Smith", urlifiedString);
    }

}
