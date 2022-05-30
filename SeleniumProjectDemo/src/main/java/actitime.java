import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://online.actitime.com/xyz18/login.do");
		driver.manage().window().maximize();
		WebElement Username=driver.findElement(By.xpath("//input[@type='text']"));
		Username.sendKeys("gggorav9@gmail.com");
		Thread.sleep(3000);
	
		WebElement Password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		Password.sendKeys("ESH@n8PW");
		Thread.sleep(1000);
		WebElement login=driver.findElement(By.xpath("//a[@id=\"loginButton\"]"));
		login.click();
		Thread.sleep(1000);
		WebElement Viewtimetrack=driver.findElement(By.xpath("//a[@href=\"/xyz18/tasks/tasklist.do\"]"));
		Viewtimetrack.click();
		Thread.sleep(1000);
		WebElement Space=driver.findElement(By.xpath("//div[@class=\"text\"]"));
		Space.click();
		Thread.sleep(1000);
		WebElement Settings=driver.findElement(By.xpath("//div[@class=\"popup_menu_icon\"]"));
		Settings.click();
		Thread.sleep(1000);
		WebElement Profile=driver.findElement(By.xpath("//a[@href=\"javascript:void(0)\"]"));
		Profile.click();
		Thread.sleep(1000);
		WebElement Close=driver.findElement(By.xpath("//div[@id=\"closeUserProfilePopupButton\"]"));
		Close.click();
		Thread.sleep(1000);
		WebElement Integrate=driver.findElement(By.xpath("//div[@id=\"popup_menu_button_addons\"]"));
		Integrate.click();
		Thread.sleep(1000);
		WebElement logout=driver.findElement(By.xpath("//a[@href=\"/xyz18/logout.do\"]"));
		logout.click();
		Thread.sleep(1000);
		
				
		

	}

}
