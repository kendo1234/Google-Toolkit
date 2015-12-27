import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WidgetTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);



    @Test

    public void checkBoxTest() {

        //Go To Google Toolkit Site
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        //Click on Monday checkbox
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id=\"gwt-debug-cwCheckBox-Monday-input\"]")));
        driver.findElement(By.cssSelector("input[id=\"gwt-debug-cwCheckBox-Monday-input\"]")).click();
        //Click on Friday checkbox
        driver.findElement(By.cssSelector("input[id=\"gwt-debug-cwCheckBox-Friday-input\"]")).click();
    }


    @Test

    public void basicButtons() {

        //Go to Basic Button tab
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwBasicButton");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='gwt-debug-cwBasicButton-normal']")));
        //Click Basic Button
        driver.findElement(By.cssSelector("button[id='gwt-debug-cwBasicButton-normal']")).click();

        //Handle JS alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //Check the disabled button
        WebElement disabledButton = driver.findElement(By.id("gwt-debug-cwBasicButton-disabled"));
        if (disabledButton.isEnabled()) {
            driver.findElement(By.id("gwt-debug-cwBasicButton-disabled")).click();
            System.out.println("the button is enabled");
        } else {
            System.out.println("the button is disabled");
        }
    }
     @Test

    public void datePicker() {
         
     }


    @After
    public void tearDown() {
        driver.close();
    }

}
