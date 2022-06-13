import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void getStringTest() {
        String result = myString.getString();
        assertEquals(null, result);
    }

    //return false. no uppercase char
    @Test
    public void detectCapitalUseTest1() {
        myString.setString("mine");
        assertEquals(false, myString.detectCapitalUse());

    }
    //return true if it has an uppercase letter
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("America");
        assertEquals(true, myString.detectCapitalUse());
    }
    // testing with number if it returns false
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("10099");
        assertEquals(false, myString.detectCapitalUse());
    }
    //testing whole string uppercase
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("WA");
        assertEquals(true, myString.detectCapitalUse());
    }
    //return false with empty string
    @Test
    public void detectCapitalUseTest5() {
        myString.setString("");
        assertEquals(false, myString.detectCapitalUse());
    }
}
