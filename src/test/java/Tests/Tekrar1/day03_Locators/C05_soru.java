package Tests.Tekrar1.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.KeyStore;
import java.time.Duration;

public class C05_soru {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Pratik1\\KurulumDosyalari\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidin
        driver.get("https://www.amazon.com");
        Thread.sleep(1000);
        driver.navigate().refresh();
        //Gift Cards linkine gidin
        WebElement giftCardsLinki = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
        giftCardsLinki.sendKeys(Keys.ENTER);
        //linkin bizi Gift Cards sayfasina yonlendirdigini test edin
        String giftCardUrl = driver.getCurrentUrl();
        if (giftCardUrl=="https://www.amazon.com/gift-cards/"){
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }
        //sayfayi kapatin
        driver.close();

    }
}
