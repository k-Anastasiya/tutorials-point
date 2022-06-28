import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    static WebDriver driver;
    @Before
    public  void initDriver(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com");
            }

    @Test
    public void verifyTitle(){
        System.out.println(" In Verify Title Test Case");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Online Tutorials Library"));
    }
    @Test
    public void verifyHeading(){
        System.out.println("In Verify Heading Text Above Search Test Case");
        String expectedEarchHeading = "fingertips";
        String actualHeading = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div[1]/h1/span")).getText();
        Assert.assertEquals(expectedEarchHeading,actualHeading);
    }
    @After
    public  void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
