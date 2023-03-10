package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazon sayfasinda kac tane link oldugunu yazdiralim
        driver.get("https://www.amazon.com/");
        List<WebElement>linkListesi= driver.findElements(By.tagName("a"));
        //linkler a tag iyla basladigi icin tagName icine a yazdik
        System.out.println("Sayfadaki link sayisi : "+ linkListesi.size());
        driver.close();
    }
}
