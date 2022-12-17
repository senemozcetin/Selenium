package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");

        //Techproeducation sayfasina gidelim
        Thread.sleep(3000); // gecisleri gorebilmek icin 3 saniye beklettik
        driver.navigate().to("http://techproeducation.com");

        //Tekrar amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back(); // Amazon sayfasina geri doner

        //Tekrar hepsiburada sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward(); // techpro ya gider

        //Son sayfada sayfayi yenileyin (refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Ve sayfayi kapatalim
        driver.close();


    }
}
