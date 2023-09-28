package anhtester.com.Bai7_WebDriver;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WindowType;

import java.util.Set;

public class InterfaceOptions extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("http://anhtester.com/");
        // Phóng hết cỡ trình duyệt theo màn hình máy tính
        driver.manage().window().maximize();

        // Add a new cookie
        Cookie newCookie = new Cookie("customName", "12345678yr56575");
        driver.manage().addCookie(newCookie);

        System.out.println(driver.manage().getCookieNamed("customName"));

        // Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();//Set khác Get ở chỗ set ko lưu gi trị trùng
        System.out.println(cookies.toString());

//        // Delete a cookie by name
//        driver.manage().deleteCookieNamed("CookieName");
//
//        // Delete all cookies
//        driver.manage().deleteAllCookies();
        closeBrowser();
    }
}
