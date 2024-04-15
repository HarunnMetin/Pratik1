package Tests.Tekrar1.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_IlkTestOtomasyonu {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Pratik1\\KurulumDosyalari\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        Thread.sleep(1000);
        driver.navigate().refresh();

        //arama kutusuna "Nutella" yazdirip aratin
        WebElement webElement = driver.findElement(By.id("twotabsearchtextbox"));
        webElement.sendKeys("Nutella"+ Keys.ENTER);
        Thread.sleep(2000);

        //arama sonuclarinin "Nutella" icerdigini test edin
        WebElement sonucYazisi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectetSonuc = "Nutella";
        String actualSonuc = sonucYazisi.getText();

        if (actualSonuc.contains(expectetSonuc)){
            System.out.println("sonuc yazisi Nutella iceriyor TEST PASSED");
        }
        else {
            System.out.println("sonuc yazisi Nutella icermiyor TEST FAILED");
        }

        driver.close();


    }
}
