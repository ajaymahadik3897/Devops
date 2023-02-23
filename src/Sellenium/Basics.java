package Sellenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

    public static void main(String[] args) throws InterruptedException {

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "D:/Drivers and Files/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();

        //Open website
        driver.get("https://www.amazon.in/");

        //maximize the window
        driver.manage().window().maximize();

        //Finding Title
        String Title= driver.getTitle();
        System.out.println("Title of Given Website is:"+Title);

        //Finding Url
        String Url= driver.getCurrentUrl();
        System.out.println("Url of Given website is:"+Url);

        //Stay on page (millisecond)
        Thread.sleep(5000);

        //Refresh page
        driver.navigate().refresh();

        //Nevigate to other page
        driver.navigate().to("https://www.amazon.in/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2");
        Thread.sleep(5000);

        //Back to previes page
        driver.navigate().back();
        Thread.sleep(2000);

        //Go to forward
        driver.navigate().forward();
        Thread.sleep(2000);

        //Delete Cookies
        driver.manage().deleteAllCookies();

        //Closing Browser
        driver.quit();




    }
}
