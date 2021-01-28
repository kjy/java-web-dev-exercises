package exercises.technology.tests;

import org.junit.Before;
import org.junit.Test;
import exercises.technology.main.Computer;

import static org.junit.Assert.assertEquals;


public class ComputerTest {

    // initialize here
    Computer myComputer;

    // runs this before test code
    @Before
    public void beforeTest() {
        // create myComputer instance here
        myComputer = new Computer(3000, 5000, "2021");
    }

    @Test
    public void constructorSetsValuesTest() {
       // add this to myComputer
        assertEquals(3000, this.myComputer.getScreenWidth());
        assertEquals(5000, this.myComputer.getScreenHeight());
        assertEquals("2021", this.myComputer.getManufactureYear());
    }
    @Test
    public void twoPlusTwoReturnsFour() {
        // add this to myComputer
        int result = this.myComputer.processTwoPlusTwo();
        assertEquals(4, result);
    }



    // another way but Computer myComputer is repeated, not DRY
//public class ComputerTest {
//    @Test
//    public void constructorSetsValuesTest() {
//        Computer myComputer = new Computer(3000, 5000, "2021");
//        assertEquals(3000, myComputer.getScreenWidth());
//        assertEquals(5000, myComputer.getScreenHeight());
//        assertEquals("2021", myComputer.getManufactureYear());
//    }
//    @Test
//    public void twoPlusTwoReturnsFour() {
//        Computer myComputer = new Computer(3000, 5000, "2021");
//        int result = myComputer.processTwoPlusTwo();
//        assertEquals(4, result);
//    }
}
