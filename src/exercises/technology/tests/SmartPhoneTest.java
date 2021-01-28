package exercises.technology.tests;

import exercises.technology.main.Laptop;
import exercises.technology.main.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {

    SmartPhone mySmartPhone;

    @Before
    public void beforeTests() {
        mySmartPhone = new SmartPhone( 5000, 3000, "2021", true);
    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(3000, this.mySmartPhone.getScreenWidth());
        assertEquals(5000, this.mySmartPhone.getScreenHeight());
        assertEquals("2021", this.mySmartPhone.getManufactureYear());
        assertEquals(true, this.mySmartPhone.getIsConnectedTo5G());
    }

}
