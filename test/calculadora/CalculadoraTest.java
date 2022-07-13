package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois números")
	
	//new soma == T
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(0, 8);		
		assertTrue(soma == 8);	
	}
	
	//new Div == T
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(99, 11);
		Assertions.assertEquals(9, divisao);
	}
	
	//new
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(0, 0);
			fail("Exceção não lançada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(99, 0));
	}
	
	@Test
	public void testehPositivo() {
		calc.ehPositivo(-8);
		assertFalse(calc.ehPositivo(-8) == true);
	}
	
	@Test
	public void testesomatoria() {
		int resultado = calc.somatoria(15);
		Assertions.assertEquals(120, resultado);
	}
	
	@Test
	public void testecompara() {
		int resultado = calc.compara(2,1);
		int resultado1 = calc.compara(1,1);
		Assertions.assertAll(
				() -> assertThat(resultado ,equalTo(1)),
				() -> assertThat(resultado1 ,equalTo(0)),
				);
	}

}