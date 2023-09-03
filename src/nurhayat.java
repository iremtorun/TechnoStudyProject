import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class nurhayat extends BaseDriver {
    @Test
    public void Terms_Of_Use() {
        driver.get("https://techno.study/tr/");

        WebElement linktest = driver.findElement(By.xpath("//div[@class='t-checkbox__indicator']"));
        linktest.click();
        MyFunc.Bekle(2);

        WebElement linktest2 = driver.findElement(By.linkText("Kullanım Şartları"));
        linktest2.click();
        MyFunc.Bekle(2);

    }
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



