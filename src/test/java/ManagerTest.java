import management.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
     manager = new Manager ("Jo", "JO5000",35000, "Service Desk");
    }

    @Test
    public void hasName(){
        assertEquals("Jo", manager.getName());
    }
    @Test
    public void hasNino(){
        assertEquals("JO5000", manager.getNino());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, manager.getSalary(), 00);
    }


    @Test
    public void hasDeptName(){
        assertEquals("Service Desk", manager.getDeptName());
    }
    @Test
    public void canGetBonus(){
        assertEquals(350, manager.payBonus(), 00);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5000);
        assertEquals(40000, manager.getSalary(), 00);
    }



}
