import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SerkanÖzşahin extends BaseDriver {

    @Test
    public void Courses_DropDownMenu() {

        Actions action = new Actions(driver);

        driver.get("https://techno.study/tr");
        MyFunc.Bekle(2);

        WebElement ddMenu = driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));

        Action aksiyon = action.moveToElement(ddMenu).build();
        aksiyon.perform();

        WebElement sdetBtn = driver.findElement(By.xpath("(//div[@class='t966__menu-item-title t-name'])[1]"));
        sdetBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("sdet"));
    }

    @Test
    public void Courses_SubMenu() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://techno.study/tr");
        MyFunc.Bekle(2);

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement sdetBtn = driver.findElement(By.linkText("SDET Yazılım Test Mühendisi"));
        sdetBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("sdet"));

        driver.navigate().back();
    }
}
