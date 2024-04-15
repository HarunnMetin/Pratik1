package Tests.Tekrar1.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C02_IlkOtomasyonTesti {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Pratik1\\KurulumDosyalari\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        Thread.sleep(1000);
        driver.navigate().refresh();
        //4. Sayfa basligini(title) yazdirin
        System.out.println("title : "+driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedBaslik = "Amazon";
        String actualBaslik = driver.getTitle();
        if (actualBaslik.contains(expectedBaslik)){
            System.out.println("Test Basarili");
        }
        else {
            System.out.println("Test Basarisiz");
        }
        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String expectedUrl = "amazon";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test Basarili");
        }
        else {
            System.out.println("Test Basarisiz");
        }
        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandles());
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String expectedKelime = "alisveris";
        String actualKelime = driver.getPageSource();
        if (actualKelime.contains(expectedKelime)){
            System.out.println("Test PASSED");
        }
        else {
            System.out.println("Test FAILED");
        }

        //10. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();
    }
}
