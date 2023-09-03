import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Utility.BaseDriver.driver;

public class nurhayat2 extends BaseDriver {
    @Test
    public void Campus_Login(){

        driver.get("https://techno.study/tr/");

        WebElement signIn= driver.findElement(By.xpath("//*[text()='Campus Login']"));
        signIn.click();

        MyFunc.Bekle(2);

        WebElement signInCampus= driver.findElement(By.id("login-form"));
        signInCampus.click();

        MyFunc.Bekle(2);
    }
}
