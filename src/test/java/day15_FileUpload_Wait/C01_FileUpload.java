package day15_FileUpload_Wait;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_FileUpload extends TestBase {

    @Test
    public void fileUpload() {

/*
    https://the-internet.herokuapp.com/upload adresine gidin
    logo.jpeg dosyasını yükleyin(upload)
    “File Uploaded!” textinin görüntülendiğini test edin
    */
    driver.get("https://the-internet.herokuapp.com/upload");

        WebElement dosyaSecWebElement = driver.findElement(By.id("file-upload"));

        bekle(3);

        String dosyaYolu = System.getProperty("user.home")+"\\OneDrive\\Masaüstü\\b129.txt";
        dosyaSecWebElement.sendKeys(dosyaYolu);
        //“File Uploaded!” textinin görüntülendiğini test edin

        driver. findElement(By.id("file-submit")).click();









    }
}
