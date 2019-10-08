package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StriderTeste extends ClasseBasePageObject {
	
	protected WebDriverWait wait;
	
	@FindBy(className = "new-todo")
	private WebElement cmpOquePrecisaSerFeito;
	
	@FindBy(className = "toggle")
	private WebElement chcValidar;
	
	@FindBy(className = "destroy")
	private WebElement encerrarTest;

	public StriderTeste(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void PreencherTeste() throws AWTException {
		cmpOquePrecisaSerFeito.click();
		cmpOquePrecisaSerFeito.sendKeys("Teste");	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		wait = new WebDriverWait(driver, 5);
	}
	
	public void ChecarTeste() {
		chcValidar.click();
		wait = new WebDriverWait(driver, 5);
	}
	
	public void EncerrarTeste() {
		encerrarTest.click();
		wait = new WebDriverWait(driver, 5);
	}
	

}
