import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TechnoStudyMain extends BaseDriver {
    @Test
    public void SocialMedia() {
        driver.get("https://techno.study/tr");
        WebElement facebook = driver.findElement(By.cssSelector("a[aria-label='facebook']"));
        facebook.click();
        MyFunc.Bekle(2);

        WebElement instagram = driver.findElement(By.xpath("//a[@aria-label='instagram']"));
        instagram.click();
        MyFunc.Bekle(2);

        WebElement youtube = driver.findElement(By.cssSelector("a[aria-label='youtube']"));
        youtube.click();
        MyFunc.Bekle(2);

        WebElement Linkedin = driver.findElement(By.cssSelector("a[aria-label='linkedin']"));
        Linkedin.click();
        MyFunc.Bekle(2);
    }

    @Test
    public void Course() {
        driver.get("https://techno.study/tr");
        WebElement SDET = driver.findElement(By.cssSelector("a[href='https://techno.study/tr/sdet'][class=tn-atom]"));
        SDET.click();
        MyFunc.Bekle(2);

        driver.get("https://techno.study/tr");
        WebElement Android = driver.findElement(By.cssSelector("div[class='t396__elem tn-elem tn-elem__5159634201663336291315']"));
        Android.click();
        MyFunc.Bekle(2);

        driver.get("https://techno.study/tr");
        WebElement DataScience = driver.findElement(By.cssSelector("a[class='tn-atom'][href='https://techno.study/tr/data']"));
        DataScience.click();
        MyFunc.Bekle(2);
    }

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
    public void Campus_Login() {

        driver.get("https://techno.study/tr/");

        WebElement signIn = driver.findElement(By.xpath("//*[text()='Campus Login']"));
        signIn.click();

        MyFunc.Bekle(2);

        WebElement signInCampus = driver.findElement(By.id("login-form"));
        signInCampus.click();

        MyFunc.Bekle(2);
    }

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

        WebElement androidBtn = driver.findElement(By.linkText("Android Uygulama Geliştirme"));
        androidBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("androidapp"));

        driver.navigate().back();

        WebElement veriBtn = driver.findElement(By.linkText("Veri bilimi"));
        veriBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("data"));

        driver.navigate().back();

        WebElement masterBtn = driver.findElement(By.linkText("Master's Program"));
        masterBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("masters"));
    }

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

        WebElement androidBtn = driver.findElement(By.linkText("Android Uygulama Geliştirme"));
        androidBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("androidapp"));

        driver.navigate().back();

        WebElement veriBtn = driver.findElement(By.linkText("Veri bilimi"));
        veriBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("data"));

        driver.navigate().back();

        WebElement masterBtn = driver.findElement(By.linkText("Master's Program"));
        masterBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("masters"));
    }
}










