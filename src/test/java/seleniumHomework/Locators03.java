package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon.com a gidip arama kutusunu locate edin
        driver.get("https://amazon.com/");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        //arama kutusunun tagName inin input oldugunu test edin
        String expectedTagName="input"; // beklenen tag name
        String actuelTagName = aramaKutusu.getTagName(); //gercek tag name
        if (expectedTagName.equals(actuelTagName)){  // beklenen tag name ile gercek tag name birbirine esitse......
            System.out.println("Tag name testi PASSED");
        }else System.out.println("Tag name testi FAILED");

        //arama kutusunun name attribute nun degerinin field-keywords oldugunu test edin
        String expectedNameDegeri= "field-keywords";
        String actuelNameDegeri= aramaKutusu.getAttribute("name");
        if (expectedNameDegeri.equals(actuelNameDegeri)){
            System.out.println("name attribute testi PASSED");
        }else System.out.println("name attribute testi FAILED");

        driver.close();
    }
}
