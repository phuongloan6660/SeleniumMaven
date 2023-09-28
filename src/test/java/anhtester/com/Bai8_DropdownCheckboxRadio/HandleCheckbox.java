package anhtester.com.Bai8_DropdownCheckboxRadio;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkboxOne = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

        //Kiểm tra checkbox có được chọn hay không
        boolean checkboxStatusBefore = checkboxOne.isSelected();
        System.out.println(checkboxStatusBefore);

        if (checkboxStatusBefore == false) {//Nếu checkbox chưa được chọn thì .click
            checkboxOne.click();

        }
        sleep(2);
        //Kiểm tra lại kết quả sau khi click chọn
        boolean checkboxStatusAfter = checkboxOne.isSelected();
        System.out.println(checkboxStatusAfter);

        //Kiểm tra thông báo liên quan đến click chọn
        WebElement message = driver.findElement(By.xpath("//div[@id='txtAge']"));
        System.out.println("Trạng thái message: "+message.isDisplayed());
        System.out.println(message.getText());

        closeBrowser();
    }
}
