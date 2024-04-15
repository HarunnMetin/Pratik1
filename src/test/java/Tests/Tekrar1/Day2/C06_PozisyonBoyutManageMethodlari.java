package Tests.Tekrar1.Day2;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_PozisyonBoyutManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Pratik1\\KurulumDosyalari\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.instagram.com");
        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        driver.manage().window().setPosition(new Point(45,450));
        driver.manage().window().setPosition(new Point(1200,127));

        Thread.sleep(3000);
        driver.close();
    }
}
