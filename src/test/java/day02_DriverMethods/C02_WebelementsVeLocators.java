package day02_DriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class C02_WebelementsVeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sayfasina gidelim
        driver.get("http://www.amazon.com/");

        //search bolumunu incele
       // WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        //search bolumunde iphone aratalim
       // aramaKutusu.sendKeys("iphone", Keys.ENTER);
        /*
        Eger bir webelementi locate (konumunu belirleme) etmek istersek once  manuel olarak
        web sayfasini acip sayfa uzerinde sag click yapip inceleye tiklariz.
        Karsimiza cikan HTML kodlarindan locator lardan (konum belirleyiciler)  essiz olani seceriz
        Genellikle id Attribute u kullanilir. Sectigimiz attribute degerini findElement() methodu icine
        findElement(By.id("attribute degeri")) seklinde yazariz
         */

        WebElement aramaKutusu= driver.findElement(By.name("field-keywords"));
        aramaKutusu.sendKeys("iphone",Keys.ENTER);

        //Amazon sayfasindaki <input> ve <a> tag larinin sayisini yazdriniz

        List<WebElement> inputTags= driver.findElements(By.tagName("input"));
        System.out.println("Input Tag sayisi :"+ inputTags.size());

        List<WebElement>linklerList= driver.findElements(By.linkText("a"));
        System.out.println("Link sayisi : "+ linklerList.size());

        //linkleri yazdirmak icin sout un icine list i koydugumuzda bize referanslari verdi
        //bu sebeple weblementlerden olusan bir listeyi yazdirmak icin for each loop kullanmaliyiz
        for (WebElement w:linklerList){
            System.out.println(w.getText());
        }
        driver.close();








    }
}
