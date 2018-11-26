package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Program.FrameUI;

public class DoTbValTest {

	@Test
	public void testKtVal() {
		FrameUI frame = new FrameUI("Страховой калькулятор", 820, 780); /*Создани экземпляра класса FrameUI*/
		assertEquals(Double.toString(frame.TbVal(0)),"1215.0"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.TbVal(1)),"2375.0"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.TbVal(2)),"2965.0"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.TbVal(3)),"2025.0"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.TbVal(4)),"3240.0"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.TbVal(5)),"1620.0"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.TbVal(6)),"2025.0"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.TbVal(7)),"1620.0"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.TbVal(8)),"1010.0"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.TbVal(9)),"395.0"); /*Проверка соответствия ожидаемого и реального результата*/
	}

}
