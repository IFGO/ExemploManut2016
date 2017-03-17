package br.edu.ifg.manutencao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora calc;

	@Before
	public void setUp() throws Exception {
		calc = new Calculadora();
	}

	@Test
	public void deveMultiplicarCorretamente() {
		assertEquals("2 * 2 = 4", 4.0, calc.multiplicar(2.0, 2.0), 0.0);
		assertEquals("20 * 10 = 200", 200.0, calc.multiplicar(20.0, 10.0), 0.0);
	}
	
	@Test
	public void deveDividirCorretamente() {
		assertEquals("2 / 2 = 1", 1.0, calc.dividir(2.0, 2.0), 0.0);
		assertEquals("20 / 10 = 2", 2.0, calc.dividir(20.0, 10.0), 0.0);
	}
	
	@Test
	public void deveSubtrairCorretamente() {
		assertEquals("2 - 2 = 0", 0.0, calc.subtrair(2.0, 2.0), 0.0);
		assertEquals("20 - 10 = 10", 10.0, calc.subtrair(20.0, 10.0), 0.0);
	}
	
	@Test
	public void deveSomarCorretamente() {
		assertEquals("2 + 2 = 4", 4.0, calc.somar(2.0, 2.0), 0.0);
		assertEquals("20 + 10 = 30", 30.0, calc.somar(10.0, 20.0), 0.0);
	}

}
