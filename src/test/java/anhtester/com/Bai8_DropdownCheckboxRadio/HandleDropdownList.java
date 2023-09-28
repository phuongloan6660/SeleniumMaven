package anhtester.com.Bai8_DropdownCheckboxRadio;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownList extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement selectElement = driver.findElement(By.xpath("//select[@id='select-demo']"));

        //Khơi tạo đối tuượng select và giá trị là một selectElement của thẻ select trong HTML
        Select select = new Select(selectElement);

        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("Kiểm tra kiểu của Select: "+select.isMultiple());
        System.out.println("Số lượng option trong Select: "+select.getOptions().size());

        //Get option với các hàm hỗ trợ của class Select
        select.selectByVisibleText("Wednesday");

        select.selectByValue("Monday");

        select.selectByIndex(3);

        closeBrowser();
    }
}
