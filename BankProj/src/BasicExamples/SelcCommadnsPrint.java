package BasicExamples;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelcCommadnsPrint {

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
		//getting all the Options
		List<WebElement> li=sel.getOptions();
		Iterator<WebElement> it=li.iterator();
		while(it.hasNext())
		{
			WebElement E=it.next();
			System.out.println(E.getText());
		}
		System.out.println(li.size()+"items are present in the Drop Down");
		
		sel.selectByVisibleText("Supervisor");
		List<WebElement> li1=sel.getAllSelectedOptions();
		for(WebElement R1: li1)
		{
			if(R1.getText().equals("Supervisor"))
			{
				System.out.println("Supervisor is the Correct Selected value");
			}
		}
		driv.close();
		driv.quit();
	}

}
