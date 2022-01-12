import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;
    @Before
    public void before(){
        developer = new Developer("Almas", "AL5000",30000);
    }

    @Test
    public void hasName(){
        assertEquals("Almas", developer.getName());
    }
    @Test
    public void hasNino(){
        assertEquals("AL5000", developer.getNino());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, developer.getSalary(), 00);
    }

    @Test
    public void canGetBonus(){
        assertEquals(300, developer.payBonus(), 00);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5000);
        assertEquals(35000, developer.getSalary(), 00);
    }
}
