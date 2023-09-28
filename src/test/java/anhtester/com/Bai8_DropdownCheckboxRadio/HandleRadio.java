package anhtester.com.Bai8_DropdownCheckboxRadio;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleRadio extends BaseTest {

    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        WebElement radioButton = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[normalize-space()='Male']"));

        //Kiểm tra checkbox có được chọn hay không
        //boolean checkboxStatusBefore = radioButton.isSelected();
        System.out.println("Trạng thái chọn: " + radioButton.isSelected());

        if (radioButton.isSelected() == false) {    //Nếu radio chưa được chọn thì .click
            radioButton.click();
        }
        sleep(2);

        System.out.println(radioButton.isSelected());


        WebElement radioGroup = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='5 to 15']"));


        boolean sttRadioGroupBefore = radioGroup.isSelected();
        System.out.println("Trạng thái ban đầu: "+sttRadioGroupBefore);

        if (sttRadioGroupBefore == false) {    //Nếu radio chưa được chọn thì .click
            radioGroup.click();
        }
        sleep(2);



        //System.out.println("Trạng thái Radio Group:" + sttRadioGroup);

        WebElement radio0to5 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='0 to 5']"));
        WebElement radio15to50 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='5 to 15']"));
        sleep(2);



        boolean sttRadioGroupAfter = radioGroup.isSelected();///?Đang bị in ra giá trị cũ, cần hỏi lại
        System.out.println("Trạng thái lúc sau: "+sttRadioGroupAfter);



        System.out.println("Trạng thái radio 0 to 5: " + radio0to5.isSelected());//Sau này dùng Assert của TestNG để kiểm tra
        System.out.println("Trạng thái radio 15 to 50: " + radio15to50.isSelected());


        closeBrowser();
    }
}
