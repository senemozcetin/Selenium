package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {
        /*
        Ilk once browser i maximize yapalim sonra tum sayfa icin max bekleme suresi olarak 15 saniye belirtelim
        Sirasiyla amazon,facebook,youtube sayfalarina gidelim
        Amazon sayfasina tekrar donelim
        Amazon sayfasinin url inin https://www.amazon.com/ adresine esit oldugunu test edelim
        Sayfanin konumunu ve size ini  yazdiralim
        Sayfanin konumunu ve size ini istedigimiz sekilde uyarlayalim ve
        istedigimiz sekilde oldugunu test edelim ve sayfayi  kapatalim

         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().to("http://www.facebook.com/");
        driver.navigate().to("http://www.youtube.com/");
        driver.navigate().back();
        driver.navigate().back();
        String actuelCurrentUrl = driver.getCurrentUrl();
        if (actuelCurrentUrl.contains("https://www.amazon.com/")){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");

        System.out.println("Sayfanin konumu : "+ driver.manage().window().getPosition());
        System.out.println("Sayfanin size i : "+ driver.manage().window().getSize());

        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));

        System.out.println("Sayfanin yeni size i : "+driver.manage().window().getSize());
        System.out.println("Sayfanin yeni konumu : "+ driver.manage().window().getPosition());

        Dimension actuelYeniSiza= driver.manage().window().getSize();
        if (actuelYeniSiza.getWidth()==600 && actuelYeniSiza.getHeight()==600){
            System.out.println("Size testi PASSED");
        }else System.out.println("Size testi FAILED");

        Point actuelYeniKonum = driver.manage().window().getPosition();
        if (actuelYeniKonum.getX()==50 && actuelYeniKonum.getY()==50 ){
            System.out.println("Konum testi PASSED");
        }else System.out.println("Konum testi FAILED");
        driver.close();
        driver.quit();





    }
}
