package Tests.Tekrar1.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C01_DriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Pratik1\\KurulumDosyalari\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.instagram.com");
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("**********************");
        System.out.println(driver.getWindowHandles());
        Thread.sleep(3000);
        driver.close();

    }
}
