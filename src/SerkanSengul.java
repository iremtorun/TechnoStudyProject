import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SerkanSengul extends BaseDriver {


        @Test
        public void ApplyWithApplyButton() {
            driver.get("https://techno.study/tr");
            WebElement ApplyButton = driver.findElement(By.xpath("(//*[@class='t-btn t-btn_md js-click-stat'])[1]"));
            ApplyButton.click();

            WebElement NameSurname = driver.findElement(By.name("name"));
            NameSurname.sendKeys("Test Ebbubekir Sıddık");

            WebElement Email = driver.findElement(By.name("email"));
            Email.sendKeys("TestEbuBekir@gmail.com");

            WebElement PhoneNumber = driver.findElement(By.cssSelector("[name='tildaspec-phone-part[]']"));
            PhoneNumber.sendKeys("0555555555");

            Select SelectCountry = new Select(driver.findElement(By.name("country")));
            SelectCountry.selectByValue("Andorra");


            Select SelectCourse = new Select(driver.findElement(By.name("course")));
            SelectCourse.selectByValue("SDET Türkçe");

            Select SelectHireAbout = new Select(driver.findElement(By.name("survey")));
            SelectHireAbout.selectByValue("Arkadaş vasıtası ile");

            WebElement CheckBox = driver.findElement(By.cssSelector("[class='t-checkbox__indicator']"));
            CheckBox.click();

            WebElement Submit = driver.findElement(By.cssSelector("[type='submit']"));
            Submit.click();

            MyFunc.Bekle(10);
            //çıkan robotmusunuz soruna onay verin doğru resimleri seçin ve mouse bırakın

            WebElement Message = driver.findElement(By.id("tildaformsuccesspopuptext"));

            Assert.assertTrue(Message.getText().contains("Başvurunuz alınmıştır"));




        }

        @Test
        public void ClickTechoStudyLogoAndEnterWebsite() {
            driver.get("https://techno.study/tr");
            WebElement Logo = driver.findElement(By.cssSelector("[class='t228__imglogo ']"));
            Assert.assertTrue(Logo.isEnabled());

            Logo.click();
            Assert.assertTrue(driver.getCurrentUrl().equals("https://techno.study/home"));

        }
    }



