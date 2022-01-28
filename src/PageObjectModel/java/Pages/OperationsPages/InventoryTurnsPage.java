package Pages.OperationsPages;

import net.bytebuddy.description.NamedElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.html5.Utils;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.sound.sampled.Line;
import javax.xml.xpath.XPath;
import java.time.Month;
import java.util.concurrent.TimeUnit;

public class InventoryTurnsPage {
    WebDriver driver;


    By Filters1 = By.xpath("//div/div[2]/div[1]/div/div/div/div[1]/button");
    By Filters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[1]/button");
    By ClearFilters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[2]/button");
    By ChooseCustomerArrow = By.id("a");
    By FilterApply = By.xpath("//div[2]/div/div[3]/button");
    //Info Buttons
    By InventoryTurns = By.xpath("//div/div[2]/div[2]/div[1]/div/div[1]/span[2]/a/svg/path");
    By AvgStandingInventory = By.xpath("//div/div[2]/div[2]/div[1]/div/div[2]/div[2]/a/svg");
    By InventoryTurnoverPeriod = By.xpath("//div/div[2]/div[2]/div[1]/div/div[3]/div[2]/a/svg/path");

    //Chart Settings
    By ChartSettings = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/button");
    By CurrentYearInventoryTurns = By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[1]/div/div[1]/span[2]/a/svg/path");
    By PreviousYearInventoryTurns = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");
    By CurrentYearAvgStandingInventory = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    By PreviousYearAvgStandingInventory = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[4]/input");
    //Table Settings
    By TableSettings = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/button");
    By Period = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By InventoryTurnsAnnualize = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");
    By AvgStandingInventoryPallets = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    By TurnoverPeriodDays = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[4]/input");
    //Time Interval
    By Next = By.xpath("//div/div[2]/div[3]/div/button[3]");
    By Back = By.xpath("//div/div[2]/div[3]/div/button[2]");
    By Refresh = By.xpath("//div/div[2]/div[3]/div/button[1]");
    By Week = By.xpath("//div[3]/div/div/div/div/label[1]/input");
    By Month = By.xpath("//div[3]/div/div/div/div/label[2]/input");
    By Year = By.xpath("//div[3]/div/div/div/div/label[3]/input");


    //LogOut
    By LogOutButton = By.xpath("//div[2]/div/div/ul/li[3]");
    By Arrow = By.xpath("//div/div[1]/div[1]/div/div[1]/button[4]");

    public InventoryTurnsPage(WebDriver driver) {
        this.driver = driver;


    }



    public void ClickFilters() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Filters).click();
    }
    public void SearchCustomer() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(ChooseCustomerArrow).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div/input")).sendKeys("3 Little Pigs");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[2]/div/div[2]/div/div[3]/div[3]/div/div[1]/div[1]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(ChooseCustomerArrow).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(FilterApply).click();

    }


    public void ClickClearFilters() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(ClearFilters).click();
    }
    //Info Buttons
    public void ClickInventoryTurnsInfo() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.findElement(InventoryTurns).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[2]/div/div[3]/button")).click();
    }
    public void ClickAvgStandingInventoryInfo() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(AvgStandingInventory).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[2]/div/div[3]/button")).click();
    }
    public void ClickInventoryTurnoverPeriodInfo() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(InventoryTurnoverPeriod).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[2]/div/div[3]/button")).click();
    }

    //Chart Settings
    public void ClickChartSettings() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(ChartSettings).click();
    }

    public void SelectCurrentYearInventoryTurns() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYearInventoryTurns).click();
    }

    public void SelectPreviousYearInventoryTurns() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PreviousYearInventoryTurns).click();
    }

    public void SelectCurrentYearAvgStandingInventory() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYearAvgStandingInventory).click();
    }
    public void SelectPreviousYearAvgStandingInventory() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PreviousYearAvgStandingInventory).click();
    }
    //Table Settings
    public void ClickTableSettings() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(TableSettings).click();
    }
    public void SelectPeriod() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Period).click();
    }

    public void SelectInventoryTurnsAnnualize() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(InventoryTurnsAnnualize).click();
    }

    public void SelectAvgStandingInventoryPallets() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(AvgStandingInventoryPallets).click();
    }
    public void SelectTurnoverPeriodDays() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(TurnoverPeriodDays).click();
    }


    //Time Interval
    public void ClickNext() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Next).click();
    }
    public void ClickBack() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Back).click();
    }
    public void ClickRefresh() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Refresh).click();
    }
    public void SelectWeek() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Week).click();
    }
    public void SelectMonth() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Month).click();
    }
    public void SelectYear() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Year).click();
    }
    public void  LogOut(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Arrow).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LogOutButton).click();


    }
}