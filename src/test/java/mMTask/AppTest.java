package mMTask;

import org.junit.Test;
import junit.framework.Assert;

import static org.junit.Assert.*;


public class AppTest {
    @Test
    public void main() throws Exception {
        String expectedValue = "i aM testing a given string in My code. The code should convert all the sMall lettered 'M' to capital 'm'. mary had a little laMb." ;
        App myapp = new App() ;
        String returnedValue = myapp.convertmM("i am testing a given string in my code. The code should convert all the small lettered 'm' to capital 'M'. Mary had a little lamb.");
        assertEquals(expectedValue , returnedValue);
    }

}