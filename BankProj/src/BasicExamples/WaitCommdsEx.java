package BasicExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitCommdsEx 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\MyFolderS\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driv=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driv,60);
	driv.manage().window().maximize();
	driv.get("http://classroom:90/webapp/AgeProb.html");
	//boolean s=wait.until(ExpectedConditions.titleIs("Age Problem"));
	/*if(s)
	{
		System.out.println("Home Page Displayed");
	}
	else
	{
		System.out.println("Home Page not Displayed");
	}*/
	if(driv.getTitle().equals("Age Problem"))
	{
		System.out.println("Home Page Displayed11");
	}
	else
	{
		System.out.println("Home Page not Displayed22");
	}
	driv.findElement(By.id("idSubGo")).click();
	Alert a=wait.until(ExpectedConditions.alertIsPresent());
	
	if(a.getText().equals("Infant"));
	{
		System.out.println("Alert infant Displayed");
		a.accept();
	}
	driv.findElement(By.id("idAge")).sendKeys("10");
	driv.findElement(By.id("idSubGo")).click();
	
	if(a.getText().equals("Kid"))
	{
		System.out.println("Alert Kid Displayed");
		a.accept();
	}
	
}
}