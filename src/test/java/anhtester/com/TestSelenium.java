package anhtester.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class TestSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang anhtester.com
        driver.get("https://anhtester.com/");

        //Click nut Login
        //driver.findElement(By.xpath("//a[@id='btn-login']")).click();
        //driver.findElement(By.xpath("//h2[@class='card__title']//a[contains(text(),'Selenium WebDriver']"));

        //String des = String.valueOf(driver.findElement(By.xpath("//h2[contains(text(),'Xin chào các bạn. Khóa học Selenium Java này nhằm ')]")));

        //Click website Testing
        driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']")).click();

        Thread.sleep(1000);
        //Click Selenium Webdriver
        driver.findElement(By.xpath("//h2[@class='card__title']//a[normalize-space()='Selenium WebDriver with Java Basic to Advanced']")).click();
        //Cấu trúc: //thẻ[@tên thuộc tính = giá trị của thuộc tính
        Thread.sleep(1000);
        String des = driver.findElement(By.xpath("//h2[contains(text(),'Xin chào các bạn. Khóa học Selenium Java này nhằm ')]")).getText();
        Thread.sleep(1000);
        System.out.println(des);

        //Tắt brower
       driver.quit();
    }
}
