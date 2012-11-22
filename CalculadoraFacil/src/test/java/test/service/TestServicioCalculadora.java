package test.service;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import service.ServicioCalculadora;

public class TestServicioCalculadora {
	
	ServicioCalculadora calculadora;

	@Before
	public void setUp() throws Exception {
		calculadora = new ServicioCalculadora();
	}

	@Test
	public void testSumar() {
		int a = 10;
		int b = 15;
		int c = calculadora.sumar(a, b);
		System.out.println("Suma:" + c);
	}

	@Test
	public void testDividir() {
		int a = 15;
		int b = 5;
		double c = calculadora.dividir(a, b);
		System.out.println("Dividir:" + c);
	}

}
