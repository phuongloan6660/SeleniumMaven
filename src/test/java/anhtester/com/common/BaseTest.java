package anhtester.com.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class BaseTest {//Khai báo các hàm dùng chung

    public static WebDriver driver;//Để là public để dễ dàng gọi sang pakage khác

    //Khởi tạo browser
    public static void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //Đóng browser

    public static void closeBrowser() throws InterruptedException {
        sleep(1);
        driver.quit();
    }

    public static void sleep(double seconds) {

        try {
            Thread.sleep((long) (1000 * seconds));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
