package Tests.Tekrar1.day03_Locators;

import jdk.dynalink.linker.LinkerServices;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_ornek {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Pratik1\\KurulumDosyalari\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        //1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");
        Thread.sleep(1000);
        driver.navigate().refresh();
        //2- Arama kutusuna “city bike” yazip aratin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        Thread.sleep(1000);
        //3- Görüntülenen sonuçların sayısını yazdırın
        List<WebElement> sonuc = driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
        System.out.println(sonuc.size());
        //4- Listeden ilk urunun resmine tıklayın.
        WebElement ilkUurn = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
        ilkUurn.click();
        Thread.sleep(1000);

        driver.close();
    }
}
