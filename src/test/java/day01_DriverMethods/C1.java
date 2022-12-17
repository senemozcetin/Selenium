package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        /*
        En temel haliyle otomasyon yapmak icin class imiza otomasyon icin gerekli olan
        webdriver in yerini gostermemiz gerekir. Bunun icin java kutuphanesinden system.setProperty()
        methodunun icine ilk olarak driver i yazariz. Ikinci olarak diver in fiziki yolunu kopyalariz.
         */

        WebDriver driver= new ChromeDriver();
        //objeyi genelde driver olarak yazariz
        driver.get("http://www.techproeducation.com");
    }
}
