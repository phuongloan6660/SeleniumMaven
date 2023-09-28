package anhtester.com.Bai7_WebDriver;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WaitConfigurations extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("http://anhtester.com/");
        //Học ở Bài 15
        // Đặt thời gian chời ngầm định cho tất cả các element (đơn vị Giây)
        // Ví dụ thiết lập 10 giây cho tất cả
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Thiết lập thời gian chờ Load page xong mới thao tác (tối đa 30s)
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        closeBrowser();
    }
}
