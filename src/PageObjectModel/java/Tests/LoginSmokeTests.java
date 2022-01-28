package Tests;

import Pages.MetricsOneHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class LoginSmokeTests {
    @Test
    public void openingUpMetricsOne()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.DetroitLabsUser();

        //Okta
        metricsOneHomePage.DetroitLabsUserOkta();

        metricsOneHomePage.LogOut();

        driver.close();
        driver.quit();


    }
    @Test
    public void smokeTestAsHanSolo()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.HanSolo();

        //Okta
        metricsOneHomePage.HanSoloOkta();

        //Validating there is only one facility
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.findElement((By.xpath("//div/div[1]/div[1]/a/div[3]"))).click();

        //Not able to see any Financial KPIs and don't see anything in composite score
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[1]/div[2]/div[1]/a[2]")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.close();


    }
    @Test
    public void smokeTestAsPrincessLeia()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.PrincessLeia();

        //Okta
        metricsOneHomePage.PrincessLeiaOkta();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Validating that we have access to the group data and we see multiple facilities
        driver.findElement((By.xpath("//div/div[1]/div[1]/a/div[3]"))).click();


        //Selecting a facility and seeing all the KPIS
        driver.findElement((By.xpath("//div/div[1]/div[2]/div[2]/div[2]/div[1]/div/div/div/div[1]/div[3]/a[2]"))).click();
        driver.findElement((By.xpath("//div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/a[2]"))).click();
        driver.findElement((By.xpath("//div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[3]/div/div[2]/div[5]/a/div[2]"))).click();
        driver.findElement(By.xpath("//div/div[1]/div[1]/a/div[3]")).click();
        driver.findElement(By.xpath("//div/div[1]/div[2]/div[1]/a[2]")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.close();


    }
    @Test
    public void smokeTestAsLukeSkywalker()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();


        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Confirm that we DON'T have access to group data
        driver.findElement((By.xpath("//div/div[1]/div[1]/a/div[3]"))).click();

        //Navigating multiple individual facilities
        driver.findElement((By.xpath("//div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]"))).click();
        driver.findElement((By.xpath("//div/div[1]/div[1]/a/div[3]"))).click();
        driver.findElement((By.xpath("//div/div[1]/div[2]/div[2]/div[2]/div[2]/div[11]/a"))).click();
        driver.findElement((By.xpath("//div/div[1]/div[1]/a/div[3]"))).click();
        driver.findElement((By.xpath("//div/div[1]/div[2]/div[2]/div[2]/div[2]/div[18]/a/div[2]"))).click();



        //Confirming that KPI is displaying
        driver.findElement((By.xpath("//div/div[1]/div[1]/a/div[3]"))).click();
        driver.findElement(By.xpath("//div/div[1]/div[2]/div[1]/a[2]")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.close();


    }





}




