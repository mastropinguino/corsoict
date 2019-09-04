package tests;
import es1.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalcEngine {
	CalcEngine ce = null;
	
	@BeforeEach
	void setupInstance() {
		ce = new CalcEngine();
	}
	
	@Test
	void testInit() {
		ce = new CalcEngine(11);
		assertEquals(11, ce.getTotale());
	}

	@Test
	void testZeroInput() {
		ce.processa(20);
		ce.processa(0);
		assertEquals(20, ce.getTotale());
	}
	
	@Test
	void testPariGt10() {
		// somma se il numero è maggiore di 10 e pari
		ce.processa(12);
		
		assertEquals(12, ce.getTotale());
	}
	
	@Test
	void testPariLt10() {
		ce = new CalcEngine(12);
		// il prodotto se il numero è compreso tra 1-10 (estremi inclusi) ed è pari
		ce.processa(4);
		assertEquals(48, ce.getTotale());
	}
	
	@Test
	void testDispariGt10() {
		// somma se il numero è maggiore di 10 e pari
		ce = new CalcEngine(12);
		ce.processa(13);
		assertEquals(-1, ce.getTotale());
	}
	
	@Test
	void testDispariLt10() {
		ce = new CalcEngine(12);
		ce.processa(3);
		assertEquals(4, ce.getTotale());
	}
}
