package Sellenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D:/Drivers and Files/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");



    }
}
