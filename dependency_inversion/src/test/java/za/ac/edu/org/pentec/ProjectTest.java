package za.ac.edu.org.pentec;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class ProjectTest {

    private Project project;
    @Before
    public void setUp() throws Exception {
        project = new Project();
    }

    @Test
    public void implement() {
        Assert.assertEquals(project.implement(),project.implement());
    }
}