import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class irem extends BaseDriver {
    @Test
    public void SocialMedia(){
        driver.get("https://techno.study/tr");
        WebElement facebook=driver.findElement(By.cssSelector("a[aria-label='facebook']"));
        facebook.click();
        MyFunc.Bekle(2);

        WebElement instagram=driver.findElement(By.xpath("//a[@aria-label='instagram']"));
        instagram.click();
        MyFunc.Bekle(2);

        WebElement youtube= driver.findElement(By.cssSelector("a[aria-label='youtube']"));
        youtube.click();
        MyFunc.Bekle(2);

        WebElement Linkedin= driver.findElement(By.cssSelector("a[aria-label='linkedin']"));
        Linkedin.click();
        MyFunc.Bekle(2);




    }









}
