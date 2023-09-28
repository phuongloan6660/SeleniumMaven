package anhtester.com.Bai7_WebDriver;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WindowType;

import java.util.Set;

public class AdvancedBrowser extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.navigate().to("http://anhtester.com/");

        sleep(2);

        driver.switchTo().newWindow(WindowType.TAB);//Mở một tab mới
        driver.get("https://google.com");
        sleep(2);

        driver.switchTo().newWindow(WindowType.WINDOW);//Mở 1 cửa sổ mới
        driver.get("http://anhtester.com/blog");

        sleep(2);


        closeBrowser();
    }
}
