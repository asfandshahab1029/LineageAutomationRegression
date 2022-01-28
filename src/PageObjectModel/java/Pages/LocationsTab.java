package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.html5.Utils;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;
import java.util.concurrent.TimeUnit;

public class LocationsTab {
    WebDriver driver;


    By Location = By.xpath("//div/div[1]/div[2]/div[1]/a[1]");
    By LocationSearch = By.xpath("//div/div[1]/div[2]/div[2]/div[1]/div/input");



    public LocationsTab(WebDriver driver) {
        this.driver = driver;


    }

    public void  ClickLocation(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Location).click();
    }
    public void  SearchLocation(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(LocationSearch).sendKeys("Mega DC");
    }
    public void  SearchCostCenterID(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(LocationSearch).sendKeys("100105");
    }
    public void  ClickingSpecificLocation(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[1]/div[2]/div[2]/div[2]/div[2]")).click();
    }
    public void  ClickingCostIdLocation(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[1]/div[2]/div[2]/div[2]/div[2]")).click();
    }
    public void  ClearLocation(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(LocationSearch).clear();
    }
    public void  LocationHierarchy(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/div/div/div[1]/div[3]/a[2]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[1]/div[1]/a/div[3]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }

}