import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
            public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
				driver.manage().window().maximize();
				
				Thread.sleep(3000);
				WebElement tryyourself=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
				tryyourself.click();
				Thread.sleep(3000);
				WebElement iframe123=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
				driver.switchTo().frame(iframe123);
				WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
				tryit.click();
				Thread.sleep(3000);
				driver.switchTo().parentFrame();
				driver.switchTo().defaultContent();

				

				

			}

		}
	


