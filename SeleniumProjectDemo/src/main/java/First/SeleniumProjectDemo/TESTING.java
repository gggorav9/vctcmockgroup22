package First.SeleniumProjectDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESTING {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration);
	
	driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
	//driver.manage().window().maximize();
	WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
	submit.click();
	// Alert pop up handling
	// to switch selenium focus from main page to alert popup
	Alert alt=driver.switchTo().alert();
	String text=alt.getText();
	System.out.println(text);
	alt.accept();
	alt=driver.switchTo().alert();
	text=alt.getText();
	System.out.println(text);
	alt.accept();
	
	//WebElement user=driver.findElement(By.xpath("//input[@id='email']"));
	//WebElement password=driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]"));
	//WebElement loginbutton=driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
	//WebElement Createnewaccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
	//Createnewaccount.click();
	//WebElement Firstname=driver.findElement(By.xpath("//input[@type='text'])//[2]"));
	//Firstname.sendKeys("Gaurav");
	//WebElement Signup=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[10]/button"));
			//Signup.click();
	//WebElement Forgottenpassword=driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a"));
	
	//Forgottenpassword.click();
	//user.sendKeys("gauravgarg173@yahoo.in");
	//password.sendKeys("rscit@123");
	//loginbutton.click();
		//WebElement summersale=driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[3]/a"));
	//summersale.click();
	//WebElement techno=driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/div/div[5]/div/section/div/div/div[2]/div[2]/div/ol/li[2]/a/div[2]/span"));
	//techno.click();
	//WebElement sign=driver.findElement(By.xpath("//html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span/span"));
	//sign.click();
	//WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	//email.sendKeys("gggorav9@gmail.com");
	//WebElement login=driver.findElement(By.xpath("//html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input"));
	//login.click();
	//WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	//password.sendKeys("rscit@123");
	//WebElement signInSubmit=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	//signInSubmit.click();
		
				
	Thread.sleep(1000);
 }
}
