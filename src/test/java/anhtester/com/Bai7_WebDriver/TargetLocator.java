package anhtester.com.Bai7_WebDriver;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class TargetLocator extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("http://anhtester.com/");
    //Học ở bài 13
    //Ví dụ: Chuyển driver sang 1 phần tử ngoài page như: window khác, alert, iframe.

    //Handle Alert
        driver.switchTo().alert();

    // Switch to Frame
        driver.switchTo().frame(1);//Đến khung hiển thị đầu
        driver.switchTo().frame("frameName");//Đến khung hiển thị theo tên
        WebElement element = driver.findElement(By.id("id"));
        driver.switchTo().frame(element); //Chuyển đến khung hiển thị chứa element có ID chỉ định

    // Chuyển sang khung hiển thị trên trình duyệt hiện tại
        driver.switchTo().defaultContent();
        closeBrowser();
    }
}
