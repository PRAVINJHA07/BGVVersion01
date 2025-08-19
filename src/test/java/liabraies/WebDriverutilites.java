package liabraies;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverutilites {



	 public void calendar(WebDriver driver,int currentyear ,int dateofBirth,String month,String day) throws InterruptedException {

		
		int year=currentyear-dateofBirth;

		for(int i=year;i>0;i--) {

			driver.findElement(By.xpath("//span[@class=\"arrowDown\"]")).click();
			
		}
		Thread.sleep(2000);

		Select s=new Select(driver.findElement(By.xpath("//select[@class='flatpickr-monthDropdown-months']")));
		s.selectByVisibleText(month);

		Thread.sleep(2000);

		List<WebElement> allDates =driver.findElements(By.xpath("//div[@class='dayContainer']//span"));
		for(WebElement date:allDates) { if(date.getText().equals(day)) {
			date.click(); break; }

		}
	}
	 
	 public void enterThroughActions(WebDriver driver) {
		 Actions a=new Actions(driver);
		 a.sendKeys(Keys.ENTER).perform();
		 
	 }
	public void dropdown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}

	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}

	public void rightclick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}

	public void draganddrop(WebDriver driver,WebElement src,WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src,dest).perform();
	}

	public void doubleclick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}

	public void switchframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}

	public void switchBackfromFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public void alertPopupok(WebDriver driver) {
		driver.switchTo().alert().accept();
	}


	public void alertPopupcancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void switchTabs(WebDriver driver) {
		Set<String> ele = driver.getWindowHandles();
		for(String b:ele) {
			driver.switchTo().window(b);
		}
	}

	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("windows,scrollBy("+x+","+y+")");
	}


}
