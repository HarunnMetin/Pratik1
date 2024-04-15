package Tests.Tekrar1.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Pratik1\\KurulumDosyalari\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        Thread.sleep(1000);
        driver.navigate().refresh();

        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.youtube.com");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.close();
    }
}
