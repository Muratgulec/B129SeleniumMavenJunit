package day09_DropDown;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.TreeMap;

public class C03_Alerts extends TestBase {



    @Test
   public void acceptAlert() throws InterruptedException {
       // https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
       driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");



       driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();
       Thread.sleep(3000);
       driver.switchTo().alert().accept();
       String actualText= driver.findElement(By.xpath("//*[@id='result']")).getText();
       String expectedText="You successfully clicked an alert";
       Assert.assertEquals(actualText,expectedText);

    }
        @Test
        public void dismissAlert() throws InterruptedException {

            driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

            driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
            Thread.sleep(3000);
            driver.switchTo().alert().dismiss();
            Thread.sleep(3000);
           String actualText= driver.findElement(By.xpath("//*[@style=‘color:green']")).getText();
           String expectedText=" susfeuly";
           Assert.assertFalse(actualText.contains(expectedText));

        }

    @Test
    public void sendKeysAlert() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        driver.switchTo().alert().sendKeys("murat");
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
        Assert.assertTrue(result.getText().contains("murat"));
        System.out.println(result.getText());


    }


    }


