import org.bson.io.BsonOutput;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\IdeaProjects\\untitled\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.xpath("//*[text()=' Login ']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@class=\"oxd-userdropdown-img\"]")).click();
            driver.findElement(By.xpath("//*[text()='Logout']")).click();
            driver.getCurrentUrl();
        }
    }

