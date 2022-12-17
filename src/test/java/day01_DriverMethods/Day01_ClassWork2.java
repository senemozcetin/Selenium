package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_ClassWork2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();// sayfayi acacak ve maximize yapacak
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Bu method sayfadaki her bir webelement icin
                                                                           //max bekleme suresini belirler

//        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
//        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
           driver.get("http://facebook.com");
           String actualTitle = driver.getTitle();
           if (actualTitle.contains("facebook")){
               System.out.println("Title testi PASSED");
           }else System.out.println("Title testi FAILED"+ actualTitle);


//        Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actuelUrl= driver.getCurrentUrl();
        if (actuelUrl.contains("facebook")){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");

//        https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to(" https://www.walmart.com/");

//        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actuelWalmartTitle= driver.getTitle();
        if (actuelWalmartTitle.contains("Walmart")){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");


//        Tekrar “facebook” sayfasina donun
        driver.navigate().back();

//        Sayfayi yenileyin
        driver.navigate().refresh();

//        Browser’i kapatin
        driver.close();

    }
}
