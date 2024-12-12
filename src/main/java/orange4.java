import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\IdeaProjects\\untitled\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[text()=' Login ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='PIM']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[contains(@placeholder,'Type for hints...')])[1]")).sendKeys("vijay");
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[contains(@type,'button')])[6]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys(" kumar");
       driver.findElement(By.xpath("(//button[contains(@type,'submit')])[1]")).click();
    }
}