import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Gavin", "GA5000",70000, "RoS", 2000000);
    }

    @Test
    public void hasName(){
        assertEquals("Gavin", director.getName());
    }
    @Test
    public void nameCannotBeNull(){
        director.setName(null);
        assertEquals("Gavin", director.getName());
    }

    @Test
    public void canChangeEmployeeName(){
        director.setName("Andrew");
        assertEquals("Andrew", director.getName());
    }

    @Test
    public void hasNino(){
        assertEquals("GA5000", director.getNino());
    }

    @Test
    public void hasSalary(){
        assertEquals(70000, director.getSalary(), 00);
    }

    @Test
    public void hasDeptName(){
        assertEquals("RoS", director.getDeptName());
    }
    @Test
    public void canGetBonus(){
        assertEquals(1400, director.payBonus(), 00);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000);
        assertEquals(75000, director.getSalary(), 00);
    }
    @Test
    public void cantRaiseSalaryIfNegative(){
        director.raiseSalary(-200);
        assertEquals(70000, director.getSalary(), 00);
    }
}

