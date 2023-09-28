package anhtester.com.ThucHanh;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ClientCRM extends BaseTest {

    //login to CRM system
    public static void loginCRM() {
        driver.get("https://rise.fairsketch.com/signin");
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        sleep(1);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();

    }

    //Open Client page
    public static void openClientPage() {
        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        sleep(1);
        // driver.findElement(By.xpath("//a[@role='presentation'][normalize-space()='Clients']")).click();

        driver.findElement(By.xpath("//div[@id='page-content']//a[normalize-space()='Clients']")).click();
        sleep(1);

    }

    //Enter Data on Add Client
    public static void enterData(String clientName) {
        driver.findElement(By.xpath("//a[normalize-space()='Add client']")).click();
        sleep(1);
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(clientName);
        sleep(1);
        driver.findElement(By.xpath("//div[@id='s2id_created_by']")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Sara Ann", Keys.ENTER);
        sleep(1);
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("539 Vũ Tông Phan");
        sleep(1);
        driver.findElement(By.id("city")).sendKeys("Ha Noi");
        driver.findElement(By.id("state")).sendKeys("Thanh Xuan");
        driver.findElement(By.id("zip")).sendKeys("1000");
        driver.findElement(By.id("country")).sendKeys("Viet Nam");
        driver.findElement(By.id("phone")).sendKeys("0988999888");
        driver.findElement(By.id("website")).sendKeys("google.com");
        driver.findElement(By.id("vat_number")).sendKeys("12345678");
        driver.findElement(By.id("gst_number")).sendKeys("8888");

        //Cuộn chuột đến element Cuối
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//label[normalize-space()='Disable online payment']")));

        sleep(1);
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']//input")).sendKeys("Gold", Keys.ENTER);
        sleep(1);
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

    }

    //Select Client after Adder
    public static void checkClientAfterAdded(String clientName) {
        sleep(1);
        driver.findElement(By.xpath("//div[@id='client-table_filter']//input")).sendKeys(clientName);

        sleep(2);
        String clientNameInTable = driver.findElement(By.xpath("//table[@id='client-table']//tbody//tr[1]//td[2]")).getText();
        System.out.println(clientNameInTable);
    }

    public static void checkMonthName(String monthName, String dayNumber) {
        for (int i = 1; i <= 12; i++) {
            driver.findElement(By.xpath(""));
            String getmonthName = driver.findElement(By.xpath("")).getText();
            if (monthName.equals(monthName)) {
                //Click chọn ngày
                driver.findElement(By.xpath("")).click();

                break;//thoát khỏi vòng lặp
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        createDriver();

        loginCRM();

        openClientPage();

        enterData("Công ty X");

        checkClientAfterAdded("Công ty X");

        closeBrowser();
    }
}
