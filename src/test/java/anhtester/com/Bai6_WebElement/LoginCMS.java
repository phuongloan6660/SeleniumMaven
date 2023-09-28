package anhtester.com.Bai6_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang winio.content.com
        driver.get("https://stagingv2.admin.hypit.paditech.org/");
        Thread.sleep(1000);

        //Bắt Web Element Email (Object)
        WebElement inputUsername = driver.findElement(By.name("user_name"));
        inputUsername.sendKeys("super_admin");
        driver.findElement(By.name("password")).sendKeys("12345678");
        Thread.sleep(1000);

        //Hàm clear() để xóa giá trị ô text
        //inputUsername.clear();
        Thread.sleep(1000);
        //

        //Hàm isDisplayed() để kiểm tra một phần tử có hiển thị hay không
        WebElement titleLogin = driver.findElement(By.xpath("//h5[contains(text(),'Đăng nhập')]"));
        System.out.println("Trạng thái tiêu đề Đăng nhập: " + titleLogin.isDisplayed());

        System.out.println(titleLogin.getText());

        System.out.println("Lấy text của ô username: " + inputUsername.getText());
        WebElement buttonLogin = driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]"));

        //driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();

        //getSize:  lấy chiều rộng và chiều cao của phần tử được hiển thị. Không có tham số và trả về đối tượng Thứ nguyên (Width, Height)
        Dimension dimension = buttonLogin.getSize();
        System.out.println("Heigh: " + dimension.height + "\nWidth: " + dimension.getWidth());

        //getLocation:  xác định vị trí của phần tử trên trang. Không có tham số và trả về đối tượng Point (X, Y)
        Point point=buttonLogin.getLocation();
        System.out.println("X buttonLogin: "+point.x+"\nY buttonLogin: "+point.y);


        //if (titleLogin.isDisplayed() == true) {
        buttonLogin.submit(); //submit() = enter
        // }
        Thread.sleep(1000);


        //System.out.println(titleLogin.getCssValue("color"));


        //hàm isEnable : có được bật hay tắt

        //getTagname: Lấy tên thẻ html. Dùng khi muốn lấy nhiều element cùng loại

        //getAttribute: Lấy giá trị của thuộc tính đã cho
        //System.out.println("Name của username là : "+ inputUsername.getAttribute("name"));





        driver.quit();


    }
}

