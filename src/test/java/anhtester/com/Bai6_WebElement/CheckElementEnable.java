package anhtester.com.Bai6_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckElementEnable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang
        driver.get("https://dofactory.com/html/button/disabled");
        Thread.sleep(1000);

//        WebElement checkboxRemember = driver.findElement(By.id("remember"));
//        System.out.println("Đã chọn: " + checkboxRemember.isSelected());


        //hàm isEnable : có được bật hay tắt
        WebElement buttonClickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
        System.out.println("Nút " + buttonClickMe.getText() + " " +buttonClickMe.isEnabled());

        //hàm isEnable : có được bật hay tắt
        WebElement buttonTryItLive = driver.findElement(By.xpath("(//button[normalize-space()='Try it live'])[1]"));
        System.out.println("Nút " + buttonTryItLive.getText() + " " + buttonTryItLive.isEnabled());

        //   //table//tbody//tr[1]//td: Kểm tra 1 dòng có bao nhiêu cột


        driver.quit();

    }
}
