package anhtester.com.Bai8_DropdownCheckboxRadio;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleMultiCheckbox extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        sleep(1);

        //Lấy hết list checkbox
        List<WebElement> listCheckbox = driver.findElements(By.xpath("//label[contains(normalize-space(),'Option')]"));
        System.out.println(listCheckbox.size());

        //driver.findElement(By.xpath("//label[normalize-space()='Option 1']")).click();

        //Click lần lượt các checkbox
        for (int i = 1; i <= listCheckbox.size(); i++) {
            sleep(1);
            driver.findElement(By.xpath("//label[normalize-space()='Option " + i + "']")).click();
        }
        //Check lại xem cac ô có được chọn
        for (int i = 1; i <= listCheckbox.size(); i++) {
            sleep(1);
            boolean isSelected = driver.findElement(By.xpath("//label[normalize-space()='Option " + i + "']/input")).isSelected();
            System.out.println(isSelected);
        }

        closeBrowser();


        //cách lấy các multi checkbox: //label[contains(normalize-space(),'Option')]
        //hoặc sử dụng tim các thẻ bên dưới: //div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']
        //hoặc sử dụng tìm các thẻ con có class=...: //div[@class='panel-body']/child::div//label//input[@class='cb1-element']
    }
}
