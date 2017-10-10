package BasicExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithNestedAlerts {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\MyFolderS\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		//Maximize browser
		Driver.manage().window().maximize();
		//--------------------------------------------------
		//Explicit wait object
		WebDriverWait wait=new WebDriverWait(Driver, 60);
		//------------------------------------------------
		//Open application
		Driver.get("http://classroom:90/webapp/Ex3.html");
		//wait for Submit
		WebElement objSubmit=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));
		//Verify Submit button
		if(objSubmit.isDisplayed())
		{
			System.out.println("Submit button displayed");
		}
		//Choose answer
		Driver.findElement(By.xpath("//input[@name='rdoPres'][4]")).click();
		//Click on submit
		objSubmit.click();
		//wait for alert 
		Alert A=wait.until(ExpectedConditions.alertIsPresent());
		//Verfiy Are you sure you want to submit this answer? message
		if(A.getText().equals("Are you sure you want to submit this answer?"))
		{
			System.out.println("Confirmation displayed");
			A.accept();
		
		
			//wait for submitted alert
			//Alert A1=wait.until(ExpectedConditions.alertIsPresent());
			//Verfiy submitted alert
			if(A.getText().equals("submitted"))
			
				System.out.println("submitted displayed");
				
				A.accept();
			}
		
	
		//Driver.close();
		//Driver.quit();
	}
}