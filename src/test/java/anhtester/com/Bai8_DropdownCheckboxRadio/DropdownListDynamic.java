package anhtester.com.Bai8_DropdownCheckboxRadio;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class DropdownListDynamic extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        sleep(1);

        //Click vào dropdown
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        sleep(1);
        //Search giá trị cần chọn

        //driver.findElement(By.xpath("(//div[@class='chosen-drop'])[3]/child::div[@class='chosen-search']")).sendKeys("Hotels");
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Travel");
        //click chọn Text đã search (cần chọn)
        sleep(1);
       // driver.findElement(By.xpath("//span[normalize-space()='Hotels']"));

       // driver.findElement(By.xpath("//li[@class='active-result result-selected highlighted']")).click();

        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        closeBrowser();
    }
}
