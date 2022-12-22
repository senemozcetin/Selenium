package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AmazonSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chore.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //amazon sayfasina gidin
        driver.get("https://www.amazon.com/");

        //Search(ara) "city bike"
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        //amazon da goruntulenen ilgili sonuclarin (kac tane "citybike" yazisi elde ettigim) sayisini yazdirin
        List<WebElement> istenenElementListesi= driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi= istenenElementListesi.get(0);
        System.out.println(sonucYazisiElementi.getText());

        //ilk resme tiklayin
        List<WebElement> urunResimleri= driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi= urunResimleri.get(0);
        ilkUrunResmi.click();

        //driver.close();









    }
}
