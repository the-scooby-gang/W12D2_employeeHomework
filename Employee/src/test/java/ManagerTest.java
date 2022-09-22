import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Employee employee;

    @Before
    public void before(){
        employee = new Manager("Aimee", "JS142125C", 30000, "IT");
    }

    @Test
    public void employeeHasName(){
        assertEquals ("Aimee", employee.getName());
    }

    @Test
    public void employeeHasNINumber(){
        assertEquals("JS142125C", employee.getNiNumber());
    }

    @Test
    public void employeeHasSalary(){
        assertEquals(30000, employee.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(200);
        assertEquals (30200, employee.getSalary());
    }

    @Test
    public void canGetBonus(){
        assertEquals (300, employee.payBonus(1));
    }


}
