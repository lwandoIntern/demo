package za.ac.edu.org.pentec;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrontEndDeveloperTest {

    private FrontEndDeveloper front;
    @Before
    public void setUp() throws Exception {
        front = new FrontEndDeveloper();
    }

    @Test
    public void writeJavascript() {
        Assert.assertEquals(front.writeJavascript(),front.writeJavascript());
    }
}