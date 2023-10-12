package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddroping {
public static void main(String []args) {
	System.setProperty("webdriver.chrome.driver", "D:\\ec\\DragandDrop\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();

	WebElement iframeelement=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	driver.switchTo().frame(iframeelement);

	Actions ac=new Actions(driver);
	WebElement drag=driver.findElement(By.xpath("draggable"));
	WebElement drop=driver.findElement(By.xpath("droppable"));

	
	//ac.dragAndDrop(drag, drop).perform();
	ac.clickAndHold(drag)
	.moveToElement(drop)
	//.release()
	.build().perform();
}

	
}
