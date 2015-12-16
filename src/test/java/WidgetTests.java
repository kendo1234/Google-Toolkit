import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WidgetTests {
    WebDriver driver = new FirefoxDriver();

    @Test

    public void checkBoxTest() {

        //Go To Google Toolkit Site
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        //Click on Monday checkbox
        WebElement mondayCheckBox = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[4]/div/div[3]/div/div[3]/div/div[2]/div/div[2]/div/div[3]/div/div/table/tbody/tr[2]/td/span/input"));
        mondayCheckBox.click();
        //Click on Friday checkbox
        WebElement fridayCheckBox = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[4]/div/div[3]/div/div[3]/div/div[2]/div/div[2]/div/div[3]/div/div/table/tbody/tr[6]/td/span/input"));
        fridayCheckBox.click();
    }
    @After
    public void tearDown() {
        driver.close();
    }

}
