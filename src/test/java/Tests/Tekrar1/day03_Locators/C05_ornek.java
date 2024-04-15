package Tests.Tekrar1.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_ornek {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Pratik1\\KurulumDosyalari\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        WebElement addButonu = driver.findElement(By.xpath("//*[text()='Add Element']"));
        addButonu.click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("delete butonu gozukuyor TEST PASSED");
        }
        else {
            System.out.println("delete butonu gozukmuyor TEST FAILED");
        }
        //4- Delete tusuna basin
        deleteButonu.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElementi = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveElementi.isDisplayed()){
            System.out.println("Add/Remove Elements” yazisi gorunuyor TEST PASSED");
        }
        else {
            System.out.println("Add/Remove Elements” yazisi gorunuyor TEST FAILED");
        }

        driver.close();
    }
}
