package Tests.Tekrar1.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Pratik1\\KurulumDosyalari\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //Amazon sayfasina gidin
        driver.get("https://www.amazon.com");
        Thread.sleep(1000);
        driver.navigate().refresh();

        //sayfa basliginin "smile more" icerdigini test edin
        String expectedSayfaBasligi = "smile more";
        String actualSayfaBasligi = driver.getTitle();
        if (actualSayfaBasligi.contains(expectedSayfaBasligi)){
            System.out.println("sayfa basligi smile more iceriyor PASSED");
        }
        else {
            System.out.println("sayfa basligi smile more icermiyor FAILED");
        }
        //youtube anasayfaya gidin
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(1500);
        //url'in youtube icerdigini test edin
        String expectedUrl = "youtube";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("url youtube iceriyor PASSED");
        }
        else {
            System.out.println("url youtube icermiyor FAILED");
        }
        //tekrar amazon sayfasina donun
        driver.navigate().back();
        Thread.sleep(1000);
        //ve url'in "ramazon" icermedigini test edin
        String expectedUrl1 = "ramazon";
        String actualUrl1 = driver.getCurrentUrl();
        if (!actualUrl1.contains(expectedUrl1)){
            System.out.println("url ramazon icermiyor PASSED");
        }
        else {
            System.out.println("url ramazon iceriyor FAILED");
        }
        //tekrar youtube anasayfayagidin
        driver.navigate().forward();
        Thread.sleep(2000);
        //kaynak kodlarinda "music" gectigini test edin
        String expectedKaynakKod = "music";
        String actualKaynakKod = driver.getPageSource();
        if (actualKaynakKod.contains(expectedKaynakKod)){
            System.out.println("kaynak kodlar music iceriyor PASSED");
        }
        else {
            System.out.println("kaynak kodlar music icermiyor FAILED");
        }
        //sayfayi kapatin
        Thread.sleep(1000);
        driver.close();


    }
}
