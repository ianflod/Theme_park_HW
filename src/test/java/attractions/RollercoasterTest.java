package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(16,210.00,20.00);
        visitor2 = new Visitor(14,130.00,20.00);
        visitor3 = new Visitor(11,160.00,20.00);
        visitor4 = new Visitor(15,160.00,20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideRollerCoaster(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1)); }

    @Test
    public void canNotRideRollerCoasterHeight(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2)); }

    @Test
    public void canNotRideRollerCoasterAge(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3)); }

    @Test
    public void priceForHeightOver200(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0.0);
    }

    @Test
    public void priceForHeightUnder200(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor4), 0.0);
    }
}
