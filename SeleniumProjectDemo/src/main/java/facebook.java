import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.facebook.com");
			WebElement CreateNewAccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
			CreateNewAccount.click();
			Thread.sleep(3000);
			WebElement FirstName=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			 
            FirstName.sendKeys("Gaurav");
           
            WebElement Surname=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
            Surname.sendKeys("Garg");
            WebElement mobileno=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
            mobileno.sendKeys("8118831632");
            WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
            password.sendKeys("Hello@123");
            WebElement Birthday=driver.findElement(By.xpath("(//select[@id='day']"));
            Select s=new Select(Birthday);
            s.selectByIndex(03);
            WebElement Month=driver.findElement(By.xpath("(//select[@id='month'])"));
            Select s1=new Select(Month);
            s1.selectByIndex(9);
           // Month.click();
            WebElement Year=driver.findElement(By.xpath("(//select[@id='year']"));
            Select s2=new Select(Year);
            s2.selectByIndex(1990);
           // Year.click();
            WebElement Male=driver.findElement(By.xpath("(//input[@type='radio']"));
           Male.click();
            WebElement button=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
         button.click();
           
            
            
            
            
            
            
            
            
	}

}

