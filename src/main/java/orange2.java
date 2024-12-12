import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\IdeaProjects\\untitled\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[text()=' Login ']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[text()='PIM']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[contains(@type,'button')])[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]")).sendKeys("vijay");
        driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]")).sendKeys("t");
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

    }
}
