import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class irem extends BaseDriver {
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
    public void Course(){
        driver.get("https://techno.study/tr");
        WebElement SDET= driver.findElement(By.cssSelector("a[href='https://techno.study/tr/sdet'][class=tn-atom]"));
        SDET.click();
        MyFunc.Bekle(2);

        driver.get("https://techno.study/tr");
        WebElement Android= driver.findElement(By.cssSelector("div[class='t396__elem tn-elem tn-elem__5159634201663336291315']"));
        Android.click();
        MyFunc.Bekle(2);

        driver.get("https://techno.study/tr");
        WebElement DataScience= driver.findElement(By.cssSelector("a[class='tn-atom'][href='https://techno.study/tr/data']"));
        DataScience.click();
        MyFunc.Bekle(2);
     }












}
