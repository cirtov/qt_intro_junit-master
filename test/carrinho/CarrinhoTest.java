package carrinho;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

@DisplayName("Classe para teste do carrinho")
public class CarrinhoTest {

	private Carrinho car;
	private Produto livro2;
	public Produto livro3;
	private Produto livro4;
	
	@BeforeEach 
	public void inicializa() {
		car = new Carrinho();
		livro2 = new Produto("GPMS_Livro1", 190.00);
		livro3 = new Produto("QT_Livro2", 220.00);
		livro4 = new Produto("FMC_Livro3", 100.00);
		car.addItem(livro2);
		car.addItem(livro3);
		car.addItem(livro4);
	} 
	
	

	
	@Test 
	public void VerificarValor() {
		assertThat(car.getValorTotal(), equalTo(510.00));
	}
	
	
	@Test 
	public void VerficaQuantidadeDeItens() {
		assertThat(car.getQtdeItems(), equalTo(3));
	}
	

	@Test 
	public void VerificaItemRemovido() {
		Produto livro6 = new Produto ("temp", 90.00);
		assertThrows(ProdutoNaoEncontradoException.class, () -> car.removeItem(livro6) );
		
	}
	

}
