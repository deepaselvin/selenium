package com.revature.selenium_login_app.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScreenUI {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","d:\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://13.232.142.59:8080/charityapp-frontend/";
        String expectedTitle = "Charity";
        String actualTitle = "";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.findElement(By.xpath("//*[@id=\"view\"]/div[2]/div/div/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sha@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Shalu@123");
        driver.findElement(By.xpath("//*[@id=\"view\"]/div/div/form/input[3]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //close 
        //driver.close();

    }
}