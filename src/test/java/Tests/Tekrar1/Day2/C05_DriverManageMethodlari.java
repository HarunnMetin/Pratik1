package Tests.Tekrar1.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Pratik1\\KurulumDosyalari\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        Thread.sleep(1000);
        driver.navigate().refresh();

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("sayfanin konumu ve boyutu");
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("sayfanin maximize durumda konumu ve boyutu ");
        System.out.println("Konumu : " +driver.manage().window().getPosition());
        System.out.println("Boyutu : " +driver.manage().window().getSize());
        //7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("sayfanin fullscreen durumdaki konumu ve boyutu ");
        System.out.println("Konum : "+driver.manage().window().getPosition());
        System.out.println("Boyut : "+driver.manage().window().getSize());
        //9. Sayfayi kapatin
        driver.quit();
    }
}
