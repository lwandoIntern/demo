package za.ac.edu.org.pentec;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackEndDeveloperTest {

    private BackEndDeveloper back;
    @Before
    public void setUp() throws Exception {
        back = new BackEndDeveloper();
    }

    @Test
    public void writeJava() {
        Assert.assertEquals(back.writeJava(),back.writeJava());
    }
}