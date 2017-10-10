package BasicExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionsCommands 
{
	public static void main(String[] args) 
	{
		WebDriver Brow=new ChromeDriver();
		//Create object for action class
		Actions A=new Actions(Brow);		
//===========================================================	
		//TO perform click
		A.click(Brow.findElement(By.id("id"))).perform();
		//To perform double click
		A.doubleClick(Brow.findElement(By.name("name"))).build().perform();		
		//----------------------------------------------------------------
		WebElement E=Brow.findElement(By.id("id"));		
		
		A.click(E).perform();
		A.doubleClick(E).perform();
		//Right click
		A.contextClick(E).perform();
		//Mouse over
		A.moveToElement(E).perform();
		//-------------------------------------------------------------
		WebElement src=Brow.findElement(By.id("id"));
		WebElement des=Brow.findElement(By.id("id"));
		//-----------------------------------------------------------
		//Way 1
		A.clickAndHold(src).perform();
		A.moveToElement(des).perform();
		A.release(des).perform();
		//-----------------------------------------------------------
		//Way 2
		A.dragAndDrop(src, des).perform();
		//------------------------------------------------------------------
		A.sendKeys(Keys.ARROW_DOWN).perform();
		A.sendKeys(Keys.ARROW_RIGHT).perform();
		A.sendKeys(Keys.ENTER).perform();
	}
}