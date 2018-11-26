package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Program.FrameUI;

public class DoCalculationTestTwo {

	@Test
	public void testCalculation() {
		FrameUI frame = new FrameUI("Страховой калькулятор", 820, 780); /*Создани экземпляра класса FrameUI*/
		assertEquals("42483.0" ,frame.Calculation(2965.0, 2.0, 2.45, 1.0 ,1.8, 1.2, 0.95,1.5,0.95));  /*Проверка соответствия ожидаемого и реального результата*/
	}

}
