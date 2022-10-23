import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\dell\\OneDrive\\Desktop\\New folder (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.booking.com");
		driver.findElement(By.id("ss")).sendKeys("Amman");
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();
		}
}
