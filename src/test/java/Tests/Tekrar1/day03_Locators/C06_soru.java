package Tests.Tekrar1.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_soru {

    public static void main(String[] args) throws InterruptedException {

        //1- gerekli ayarlari yapin
        System.setProperty("webdriver.chrome.diver","C:\\Users\\acer\\Pratik1\\KurulumDosyalari\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        Thread.sleep(1000);
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedBasslik = "Spend less";
        String actualBaslik = driver.getTitle();
        if (actualBaslik.contains(expectedBasslik)){
            System.out.println("evet baslik Spend less iceriyor TEST PASSED");
        }
        else {
            System.out.println("hayir baslik Spend less iceriyor TEST FAILED");
        }
        //6- Gift Cards sekmesine basin
        WebElement giftCardSekmesi = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
        giftCardSekmesi.sendKeys(Keys.ENTER);
        //7- Specialty Gift Cards butonuna basin
        WebElement specialityGiftCardSekmesi = driver.findElement(By.xpath("//*[@alt='Specialty Gift Cards']"));
        specialityGiftCardSekmesi.click();
        //8- ilk urunu tiklayin
        WebElement ilkUrun = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-spacing-top-micro _carousel_style_product-image__3GTWS acsProductBlockV1__product_image'])[1]"));
        ilkUrun.click();
        //9- Gift card details’den 25 $’i secin
        WebElement dolarSecimi = driver.findElement(By.xpath("//button[@id='gc-mini-picker-amount-1']"));
        dolarSecimi.click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcreti = driver.findElement(By.xpath("//span[@id='gc-live-preview-amount']"));
        if (urunUcreti.equals("$25.00")){
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }

        //11-Sayfayi kapatin
        driver.close();
    }
}
