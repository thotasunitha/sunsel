package BasicExamples;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertEx 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver", "D:\\MyFolderS\\geckodriver-v0.17.0-win32\\geckodriver.exe");
FirefoxDriver driv=new 	FirefoxDriver();
driv.manage().window().maximize();



}
}
