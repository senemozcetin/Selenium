package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chore.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        1-C01_TekrarTesti isimli bir class olusturun
//        2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/ ");

//        3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

//        4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

//        5 Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedTitle= "Spend less";
          String actuelTitle= driver.getTitle();
          if (actuelTitle.contains(expectedTitle)){
              System.out.println("Title testi PASSED");
          }else System.out.println("Title testi FAILED");

//        6 Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();

//        7 Birthday butonuna basin
        driver.findElement(By.cssSelector("img[src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png']")).click();

//        8 Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.cssSelector("img[alt='Amazon.com eGift Card']")).click();

//        9- Gift card details’den 25 $’i secin
        driver.findElement(By.cssSelector("#gc-mini-picker-amount-1")).click();

//        10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcreti = driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']"));
        if (urunUcreti.getText().equals("$25.00")){
            System.out.println("Urun ucreti testi PASSED");
        }else System.out.println("Urun ucreti testi FAILED");


//        10-Sayfayi kapatin
        driver.close();
    }
}
