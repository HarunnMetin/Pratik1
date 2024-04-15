package Tests.Tekrar1.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassNameLocator {

    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Pratik1\\KurulumDosyalari\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Category bolumundeki elementleri locate edin
        List<WebElement> kategori = driver.findElements(By.className("panel-title"));

        //4- Category bolumunde 3 element oldugunu test edin
        int expectedKategoriSayisi = 3;
        int actualKategtoriSayisi = kategori.size();
        if (actualKategtoriSayisi == expectedKategoriSayisi){
            System.out.println("Category bolumunde 3 element var TEST PASSED");
        }
        else {
            System.out.println("Category bolumunde 3 element yok TEST FAILED");
        }
        //5- Category isimlerini yazdirin
        int sayi = 1;
        for (WebElement each:kategori) {
            System.out.println(sayi+" - "+each.getText());
            sayi++;
        }
        //6- Sayfayi kapatin
        driver.close();
    }
}
