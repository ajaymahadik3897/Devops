package Sellenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void main(String[]arg) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Drivers and Files/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();  //window full size

        //username
        driver.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy"); //username by using ID locator

        //password
       //remove this // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy"); //password by using Xpath locator
        Thread.sleep(2000);

        //login button
        driver.findElement(By.xpath("//*[@type='submit']")).click(); //submit by using Xpath locator

        Thread.sleep(2000);


        //successfull login msg
        String LoginSuccessfully= driver.findElement(By.xpath("//div/p")).getText(); //xpath("//div/p")=by using parent tagname(div) and child(p) we use tagname xpath
        //System.out.println(LoginSuccessfully);


        //check login is successfull in if condition
        if(LoginSuccessfully.equalsIgnoreCase("You are successfully logged in."))

        {
            System.out.println("Login successfully");
        }

         //if password is wrong then we click on forget password and nevigate to forgot password page
        else {
            System.out.println(driver.findElement(By.xpath("//*[@class='error']")).getText()); // text msg when login is failed generated on screen
            Thread.sleep(2000);

            driver.findElement(By.linkText("Forgot your password?")).click();    //click forget password button
            System.out.println("Forget Password");

            //add below data in forget password page for create new password
            driver.findElement(By.xpath("//*[@placeholder='Name']")).sendKeys("ajay"); //write name
            driver.findElement(By.xpath("//*[@type='text'][2]")).sendKeys("ajay@gmail.com"); //Write EmailID
            driver.findElement(By.xpath("//*[@type='text'][3]")).sendKeys("7276371400");  //Write Mobile NO.

            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='reset-pwd-btn']")).click();       //Click reset password button

            System.out.println("Successfully reset password and created new");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='go-to-login-btn']")).click(); //after reset password then click goto login page button

        }

        Thread.sleep(2000);
        driver.close(); //closing the browser

    }
}
