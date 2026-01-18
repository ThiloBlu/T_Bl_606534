package exercise3;
import static org.junit.Assert.* ;

import org.junit.Test;



public class TestMath {
    @Test
    public void test(){
        assertEquals(25, math.fcn(4,3,12), 0);
        assertEquals(0, math.fcn(0,1,2), 0);
        assertEquals(11, math.fcn(-4,-3,-12), 0);
    }
    
}
