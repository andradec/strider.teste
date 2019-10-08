package testes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import configuracoes.ConfiguracoesTeste;
import pageObjects.StriderTeste;

public class ClasseBaseTeste {
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected StriderTeste striderTest;
	
	public void iniciarAplicacao() {
		System.setProperty(ConfiguracoesTeste.NOME_DRIVER,ConfiguracoesTeste.CAMINHO_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,5); 
	
		driver.get(ConfiguracoesTeste.URL_APLICACAO);	
	}
	
	public void instanciarPageObjects() {
		striderTest = new StriderTeste(driver);
	}
	
	public void fecharAplicacao() {
		driver.quit();
	}
}
