package Tests.Tekrar1.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class C03_ornek {

    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Pratik1\\KurulumDosyalari\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> tumLinkler = driver.findElements(By.xpath("//a"));
        int expectedLinkSayisi = 147;
        int actualLinkSayisi = tumLinkler.size();
        if (actualLinkSayisi == expectedLinkSayisi){
            System.out.println("sayfada 147 adet link var TEST PASSED");
        }
        else {
            System.out.println("sayfada 147 adet link yok TEST FAILED");
        }
        Thread.sleep(3000);
        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText("Products")).sendKeys(Keys.ENTER);

        //5- special offer yazisinin gorundugunu test edin
        WebElement offerYazisi = driver.findElement(By.xpath("//*[@id='sale_image']"));

        if (offerYazisi.isDisplayed()){
            System.out.println("special offer yazisi gorunuyor TEST PASSED");
        }
        else {
            System.out.println("special offer yazisi gorunmuyor TEST FAILED");
        }
        //6- Sayfayi kapatin
        driver.close();
    }
}
