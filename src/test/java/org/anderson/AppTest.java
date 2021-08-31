package org.anderson;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testEquals(){
        Assert.assertEquals("qwerty","qwerty");
    }
    @Test
    public void addTest(){
        assertTrue(App.add(2,2) == 4);

    }
}
