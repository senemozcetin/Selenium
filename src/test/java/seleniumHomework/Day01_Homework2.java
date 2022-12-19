package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_Homework2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon a gidip Nutella aratalim
        driver.get("http://www.amazon.com/");

        //findElement(By.....locator) istedigimiz bir web elementini bize dondurur biz de
        //o webelementini kullanmak icin bir objeye assign ederiz

         //WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox")); Burada id ile arattik


        /*
        WebElement aramaKutusu= driver.findElement(By.className("nav-search-field "));
        bu locator calismadi
        Locator alirken gozumuzden kacan detaylar olabilir, aldigimiz bir locator calismazsa
        alternatif locatorlari denemeliyiz
         */
        WebElement aramaKutusu= driver.findElement(By.name("field-keywords")); // name ile arattik
        //herhangi bir webelementine istedigimiz yaziyi yollamak istersek
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);



    }
}
