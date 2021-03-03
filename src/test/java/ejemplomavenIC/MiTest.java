package ejemplomavenIC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MiTest {

	@Test
	public void testSumar() {
		Calc calc = new Calc(2, 2);
		Integer result = calc.sumar();
		Assertions.assertEquals(4, result);
	}

	@Test
	public void testSumarUnoMasUno() {
		Calc calc = new Calc(1, 1);
		Integer result = calc.sumar();
		Assertions.assertEquals(2, result);
	}

	@Test
	public void testRestar() {
		Calc calc = new Calc(4, 2);
		Integer result = calc.restar();
		Assertions.assertEquals(2, result);
	}

	@Test
	public void testRestarUnoMenosUno() {
		Calc calc = new Calc(1, 1);
		Integer result = calc.restar();
		Assertions.assertEquals(0, result);
	}
	//test
	@Test
	public void testMultiplicar() {
		Calc calc = new Calc(2, 8);
		Integer result = calc.multiplicar();
		Assertions.assertEquals(16, result);
	}

	@Test
	public void testMultPorCero() {
		Calc calc = new Calc(4, 0);
		Integer result = calc.multiplicar();
		Assertions.assertEquals(0, result);
	}

	//TEST
	@Test
	public void testDividir() {
		Calc calc = new Calc(100, 25);
		Integer result = calc.dividir();
		Assertions.assertEquals(4, result);
	}
}
