import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;
    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Almas", "AL5000",30000);
    }

    @Test
    public void hasName(){
        assertEquals("Almas", databaseAdmin.getName());
    }
    @Test
    public void hasNino(){
        assertEquals("AL5000", databaseAdmin.getNino());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, databaseAdmin.getSalary(), 00);
    }

    @Test
    public void canGetBonus(){
        assertEquals(300, databaseAdmin.payBonus(), 00);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5000);
        assertEquals(35000, databaseAdmin.getSalary(), 00);
    }
}
