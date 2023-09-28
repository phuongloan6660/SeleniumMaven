package anhtester.com.Bai5_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginEcCommerce {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang winio.content.com
        driver.get("https://content.winio.network/login");
        Thread.sleep(1000);

        //Điền username
        //Tìm theo name với By.name()
        driver.findElement(By.name("user_name")).sendKeys("admin");
        Thread.sleep(1000);

        //Điền password
        driver.findElement(By.name("password")).sendKeys("admin@12345678");

        Thread.sleep(1000);

        //Click Login
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/button")).click();

        driver.findElement(By.xpath("//span[contains(text(),'Quản lý chủ đề')]")).click();
        Thread.sleep(1000);

        //Click textlink
        //driver.findElement(By.linkText("WINIO")).click();
        driver.findElement(By.xpath("//a[@href='https://www.spruko.com/']")).click();




    }
}
