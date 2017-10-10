package BasicExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelcCommadns {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\MyFolderS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driv=new ChromeDriver();
		driv.get("http://apps.qaplanet.in/qahrm/login.php");
		driv.manage().window().maximize();
		driv.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driv.findElement(By.name("txtPassword")).sendKeys("user1");
		driv.findElement(By.name("Submit")).click();
		driv.switchTo().frame("rightMenu");
		WebElement ele=driv.findElement(By.name("loc_code"));
		
		Select sel=new Select(ele);
		sel.selectByVisibleText("Supervisor");
		sel.selectByValue("2");//Emp. Last Name
		sel.selectByIndex(6);//Job Title
		driv.close();
		driv.quit();
	}

}
