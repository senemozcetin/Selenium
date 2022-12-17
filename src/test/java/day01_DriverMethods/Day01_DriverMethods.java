package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver(); // Bos bir browser actik

        driver.get("https://www.amazon.com"); // ilk olarak gitmek istedigimiz sayfayi belirtiriz

        System.out.println("Sayfa basligi : "+ driver.getTitle()); // sayfanin basligini aldik

        System.out.println(" Sayfa url i: "+driver.getCurrentUrl()); // sayfanin url ini aldik

       // System.out.println(driver.getPageSource()); // icinde olunan sayfanin kaynak kodlarini string olarak getirir

        System.out.println(driver.getWindowHandle()); // bize o window a ait hash degerini verir. Biz bu hash degerlerini
                                                      //bir string e atayip pencereler arasi gecis yapabiliriz


    }
}
