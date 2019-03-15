package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProjectOneTest {

    private ProjectOne projectOne;
    private List<Developer> develops;
    @Before
    public void setUp() throws Exception {
        develops = new ArrayList<>();
        develops.add(new FrondEnd());
        develops.add(new BackEnd());
        projectOne = new ProjectOne(develops);
    }

    @Test
    public void implement() {
        Assert.assertEquals(develops.get(0),develops.get(0));
    }
}