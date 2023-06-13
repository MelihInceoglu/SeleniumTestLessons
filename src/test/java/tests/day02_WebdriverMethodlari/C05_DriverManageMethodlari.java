package tests.day02_WebdriverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.wisequarter.com");
        System.out.println("Basslangic konumu : "+driver.manage().window().getPosition());
        System.out.println("Baslangic size  :"+driver.manage().window().getSize() );

        driver.manage().window().setSize(new Dimension(1200,500));
        driver.manage().window().setPosition(new Point(100,200));

        System.out.println("Degisen konumu : "+driver.manage().window().getPosition());
        System.out.println("Degisen  size  : "+driver.manage().window().getSize() );









        Thread.sleep(3000);
        driver.close();
    }
}
