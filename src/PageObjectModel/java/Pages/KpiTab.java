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

public class KpiTab {
    WebDriver driver;

    //Labor
    By HourlyLabel= By.xpath("//div/div[1]/div[2]/div[1]/a[1]");
    By ProductivityActivity = By.xpath(("//div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]"));
    By ProductivityVolume = By.xpath("//div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[3]/div[2]");
    By Turnover = By.xpath("//div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[4]/div[2]");
    //Operations
    By Energy = By.xpath("//div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div/div/div[1]/div[2]");
    By InventoryAdjustments = By.xpath("//div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div/div/div[1]");
    By InventoryHealth = By.xpath("//div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div/div/div[3]/div[2]");
    By InventoryTurns = By.xpath("//div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div/div/div[3]/div[2]");
    By PutawayCompliance = By.xpath("//div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div/div/div[5]/div[2]");
    By TurnTimes = By.xpath("//div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div/div/div[6]/div[2]");
    By Volume = By.xpath("//div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div/div/div[7]/div[2]");
    By WareHouseUtilization = By.xpath("//div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div/div/div[8]/div[2]");
    //Safety
    By Compliance = By.xpath("//div/div[1]/div[2]/div[2]/div/div[4]/div[2]/div/div/div[1]/div[2]");
    By Tir = By.xpath("//div/div[1]/div[2]/div[2]/div/div[4]/div[2]/div/div/div[2]/div[2]");
    //Financials
    By Editdar = By.xpath("//div/div/div[1]/div[2]/div[2]/div/div[5]/div[2]/div/div/div[1]");
    By Expenses = By.xpath("//div/div[1]/div[2]/div[2]/div/div[5]/div[2]/div/div/div[2]/div[2]");
    By LaborToRevenue = By.xpath("//div/div[1]/div[2]/div[2]/div/div[5]/div[2]/div/div/div[3]/div[2]");
    By Revenue = By.xpath("//div/div[1]/div[2]/div[2]/div/div[5]/div[2]/div/div/div[4]/div[2]");

    By LocationSearch = By.xpath("//div/div[1]/div[2]/div[2]/div[1]/div/input");


    public KpiTab(WebDriver driver) {
        this.driver = driver;

    //Labor
    }
    public void  ClickHourlyLabel(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(HourlyLabel).click();
    }
    public void  ProductivityActivity(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(ProductivityActivity).click();
    }
    public void  ClickProductivityVolume(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(ProductivityVolume).click();
    }
    public void  ClickTurnOver(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Turnover).click();
    }
    //Operations
    public void  ClickEnergy(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Energy).click();
    }
    public void  ClickInventoryAdjustments(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(InventoryAdjustments).click();
    }
    public void  ClickInventoryHealth(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(InventoryHealth).click();
    }
    public void  ClickInventoryTurns(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(InventoryTurns).click();
    }
    public void  ClickPutawayCompliance(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PutawayCompliance).click();
    }
    public void  ClickTurnTimes(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(TurnTimes).click();
    }
    public void  ClickVolume(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Volume).click();
    }
    public void  ClickWarehouseUtilization(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(WareHouseUtilization).click();
    }
    //Safety
    public void  ClickCompliance(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Compliance).click();
    }
    public void  ClickTir(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Tir).click();
    }
    //Financials
    public void  ClickEditdar(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Editdar).click();
    }
    public void  ClickExpenses(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Expenses).click();
    }
    public void  ClickLaborToRevenue(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(LaborToRevenue).click();
    }
    public void  ClickRevenue(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Revenue).click();
    }

}