package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //add element butonuna basin
        //driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //driver.findElement(By.xpath("//button[text()='Add Element']"));
        driver.findElement(By.xpath("//*[text()='Add Element']"));


        // delete butonunun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Delete butonu testi PASSED");
        }else System.out.println("Delete butonu testi FAILED");

        //delete tusuna basin
        deleteButonu.click();

        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveYaziElementi= driver.findElement(By.xpath("//h3"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("Add remove yazi testi PASSED");
        }else System.out.println("Add remove yazi testi FAILED");

        //driver.close();

    }
}
