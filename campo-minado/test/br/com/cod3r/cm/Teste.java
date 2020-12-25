package br.com.cod3r.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testarSeIgual() {
		int a = 1 + 1;
		assertEquals(2, a);
	}
	@Test
	void testarFuncao() {
		char x = 'a';
		assertEquals('a', x);
	}
}
