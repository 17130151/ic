
package Testing;

import junit.framework.TestCase;

import Program.FrameUI;

public class DoCalculationTestTwo1 extends TestCase{


public void testCalculation() {
FrameUI frame = new FrameUI("Страховой калькулятор", 820, 780); 
assertEquals("42483.0" ,frame.Calculation(2965.0, 2.0, 2.45, 1.0 ,1.8, 1.2, 0.95,1.5,0.95)); 
}

}
