package tests.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04 {

    public static void main(String[] args) {

        //  Execise - 4
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //  Navigate to website https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        //  Under the ORIGINAL CONTENTS click on Alerts
        driver.findElement(By.id("alerts")).click();
        //  print the URL
        System.out.println(driver.getCurrentUrl());
        //  navigate back
        driver.navigate().back();
        //  print the URL
        System.out.println(driver.getCurrentUrl());
        //  Click on Basic Ajax
        driver.findElement(By.xpath("//*[@id='basicajax']")).click();
        //  print the URL
        System.out.println(driver.getCurrentUrl());
        //  enter value 20 and ENTER
        driver.findElement(By.id("lteq30")).sendKeys("20"+ Keys.ENTER);
        //  and then verify Submitted Values is displayed open page
        String expectedResult="Submitted Values";
        String actualResult=driver.findElement(By.xpath("//*[text()='Submitted Values']")).getText();
        if (expectedResult.equals(actualResult)){
            System.out.println("Test Başarılı");
        }else {
            System.out.println("Test Başarısız");
        }


        //  close driver
        driver.close();



    }
}
