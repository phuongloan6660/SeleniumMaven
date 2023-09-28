package anhtester.com.Bai7_WebDriver;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;

public class BasicBrowser extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.navigate().to("http://anhtester.com/");

        sleep(2);

        driver.findElement(By.id("btn-login")).click();
        sleep(2);

        driver.navigate().back();//Điều hướng trở về trang trước
        sleep(2);

        driver.navigate().refresh();//Làm mới trang
        sleep(2);

        //driver.navigate().forward();//Điều hướng đến trang tiếp sau
        //sleep(2);

        String title=driver.getTitle();//Lấy tiêu đề của trang
        System.out.println("Title: "+title);

        String url = driver.getCurrentUrl();
        System.out.println("URL: "+url);

        String html = driver.getPageSource();
        System.out.println("HTML\n"+html);




        closeBrowser();
    }
}
