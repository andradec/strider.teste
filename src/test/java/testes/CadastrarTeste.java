package testes;

import java.awt.AWTException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pageObjects.StriderTeste;

public class CadastrarTeste extends ClasseBaseTeste {
	
	@Before
	public void antesDeTudo() {
		iniciarAplicacao();
		instanciarPageObjects();
	}
	
	@Test
	public void CadastrarTeste() throws AWTException {
		striderTest.PreencherTeste();
		striderTest.ChecarTeste();
		striderTest.EncerrarTeste();
	}
	
	@After
	public void depoisDeTudo(){
		fecharAplicacao();
	}
	

}
