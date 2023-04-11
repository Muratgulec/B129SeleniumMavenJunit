import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Alistirma {
    public static void main(String[] args) {

        // https://www.amazon.com/ adresine gidin
        // arama kutusunun, tagName'inin 'input' oldugunu test ediniz
        // arama kutusunun, name attribute'nun degerinin 'field-keywords' oldugunu test edin
        // sayfayi kapatiniz


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        String actualNameDegeri = aramaKutusu.getAttribute("name");

        String expectedNameDegeri = " field-keywords";

        if (expectedNameDegeri.equals(actualNameDegeri)) {
            System.out.println("name dgeri fielsdkeyvords");

        } else {
            System.out.println("degil");


        }
    }}
