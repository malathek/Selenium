package Ass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;


public class Positive {

    @Test
    public void sc1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("login-username")).sendKeys("malathe91@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("rapidFire$7");
        driver.findElement(By.className("checkbox-radio-icon")).click();
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(5000);
        String TextDashBoard = driver.findElement(By.className("page-sub-title")).getText();
        System.out.println(TextDashBoard);
        if(TextDashBoard.contains("Malathe K")){
            System.out.println("Test case Passed");
        }
        else{
            System.out.println("Test case failed");
        }
        }

    }