package seleniumHomework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Homework {
    public static void main(String[] args) {
//        1. Yeni bir class olusturun (TekrarTesti)
//        2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
//        doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://youtube.com/");
        String actuelTitle= driver.getTitle();
        if (actuelTitle.contains("youtube")){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

//        3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
//        doğru URL'yi yazdırın.

        String actuelCurrentUrl= driver.getCurrentUrl();
        if (actuelCurrentUrl.contains("youtube")){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED" + actuelCurrentUrl);

//        4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

//        5. Youtube sayfasina geri donun
        driver.navigate().back();

//        6. Sayfayi yenileyin
        driver.navigate().refresh();

//        7. Amazon sayfasina donun
        driver.navigate().forward();

//        8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();

//        9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
//                Yoksa doğru başlığı(Actual Title) yazdırın.
        String actuelTitle2= driver.getTitle();
        if (actuelTitle2.contains("Amazon")){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED"+ actuelTitle2);

//        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
//        URL'yi yazdırın
        String actuelCurrentUrl2= driver.getCurrentUrl();
        if (actuelCurrentUrl2.contains("https://www.amazon.com/")){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED"+ actuelCurrentUrl2);

//        11.Sayfayi kapatin
        driver.close();


//
//        1. Yeni bir Class olusturalim.C05_NavigationMethods
//
//        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//
//        2. Youtube ana sayfasina gidelim . https://www.youtube.com/
//        driver.navigate().to("http://youtube.com/");
//
//        3. Amazon soyfasina gidelim. https://www.amazon.com/
//        driver.navigate().to("http://amazon.com/");
//
//        4. Tekrar YouTube’sayfasina donelim
//        driver.navigate().back();
//
//        5. Yeniden Amazon sayfasina gidelim
//        driver.navigate().forward();
//
//        6. Sayfayi Refresh(yenile) yapalim
//        driver.navigate().refresh();
//
//        7. Sayfayi kapatalim / Tum sayfalari kapatalim
//        driver.close();
//        driver.quit();



        //amazon sitesine gidip Kaynak Kodlarinda "Gateawey" yazdigini test edin
//        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
//        WebDriver driver= new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("http://www.amazon.com");
//        String sayfaKaynakKodlari= driver.getPageSource();
//        String arananKelime= "Gateawey";
//        if (sayfaKaynakKodlari.contains(arananKelime)){
//            System.out.println("Kaynak kodu testi PASSED");
//        }else System.out.println("Kaynak kodlarinda "+arananKelime+ "yok ,test FAILED");
//        driver.close();


//        System.setProperty("webDriver.chrome.driver","src/resources/drivers/chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//
//        //http://www.amazon.com url sine gidin
//        driver.get("http://www.amazon.com");
//
//        //basligin Amazon kelimesi icerdegini test edin
//        String actuelTitle= driver.getTitle();
//        if (actuelTitle.contains("Amazon")){
//            System.out.println("Actuel test PASSED");
//        }else System.out.println("Actuel test FAILED");
//
//        //url nin  "http://www.amazon.com" a esit oldugunu test edin
//        String actuelCurrentUrl= driver.getCurrentUrl();
//        if (actuelCurrentUrl.equals("http://www.amazon.com")){
//            System.out.println("Url test PASSED");
//        }else System.out.println("Url test FAILED");// test FAILED cunku url in sonunda bir tane / eksikti
//
//        //Sayfayikapatin
//        driver.close();


    }
}
