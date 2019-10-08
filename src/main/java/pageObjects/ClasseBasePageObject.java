package pageObjects;

import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClasseBasePageObject {

	protected WebDriver driver;
	protected Random random;
	protected WebDriverWait wait;
	protected JavascriptExecutor js;
	protected Actions actions;
		
	public ClasseBasePageObject(WebDriver driver) {
		this.driver = driver;
		 random = new Random();
		 wait = new WebDriverWait(driver,5);
		 actions = new Actions(driver);
	}		
}
