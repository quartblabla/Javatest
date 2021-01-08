package org.pageObjectModel;/*package org.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;



public class YoutubeMainPage {
    System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    @FindBy(id="search")

    private WebElement mainSearchField;
    driver.navigate().to("https://www.thepromoapp.com/#!/");

}*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class YoutubeMainPage {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//Applied wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://thepromoapp.com/#!/login");
        driver.findElement(By.name("userName")).sendKeys("quartblabla1@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Zxz123Zxz@");
        driver.findElement(By.cssSelector("#login_form > div.col-md-12.pa-no-padding.pt-top-30 > button.btn.btn-login.ob-padding-0.h-48.ob-line-ht-48.pa-font-bold.pa-font-16")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }

}

