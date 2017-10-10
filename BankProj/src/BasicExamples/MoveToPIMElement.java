package BasicExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MoveToPIMElement 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\MyFolderS\\chromedriver_win32\\chromedriver.exe");
		//create object for a class, it will launch browser
		ChromeDriver Brow=new ChromeDriver();
		Brow.get("http://apps.qaplanet.in/qahrm/login.php");
		Brow.manage().window().maximize();
		Thread.sleep(2000);
		Brow.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		Brow.findElement(By.name("txtPassword")).sendKeys("user1");
		Brow.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
	
		//-----------------------------------------------------------
		//Create object for action class
		Actions A=new Actions(Brow);
		//Move to PIM/Mouse over on PIM
		WebElement PIM=Brow.findElement(By.id("pim"));
		//Mouse over on PIM
		A.moveToElement(PIM).perform();
		Thread.sleep(4000);
		Brow.findElement(By.linkText("Add Employee")).click();
		//*****************************************************************
		Thread.sleep(2000);
		Brow.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		Brow.close();
		Brow.quit();
		//=============================================================
	}
}
