package Pages.OperationsPages;

import net.bytebuddy.description.NamedElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.html5.Utils;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.sound.sampled.Line;
import javax.xml.xpath.XPath;
import java.time.Month;
import java.util.concurrent.TimeUnit;

public class InventoryAdjustmentsPage {
    WebDriver driver;

    By Filters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[1]/button");
    By ClearFilters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[2]/button");
    //Chart Settings
    By ChartSettings = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/button");
    By Target = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/button");
    By CurrentYearNet = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By PreviousYearNet = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");

    //Table Settings
    By TableSettings = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/button");
    By TableSettingsAdjustments = By.xpath("//div/div[2]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[1]/button/svg");
    By Period = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By Absolute = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");
    By Net = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    By Positive = By.xpath("//div/div[2]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By Negative = By.xpath("//div/div[2]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");

    //Time Interval
    By Next = By.xpath("//div/div[2]/div[3]/div/button[3]");
    By Back = By.xpath("//div/div[2]/div[3]/div/button[2]");
    By Refresh = By.xpath("//div/div[2]/div[3]/div/button[1]");
    By Week = By.xpath("//div[3]/div/div/div/div/label[1]/input");
    By Month = By.xpath("//div[2]/div/div/div/div/label[1]");
    By Year = By.xpath("//html/body/div[2]/div/div/div/div/label[2]/input");

    //LogOut
    By LogOutButton = By.xpath("//div[2]/div/div/ul/li[3]");
    By Arrow = By.xpath("//div/div[1]/div[1]/div/div[1]/button[4]");



    public InventoryAdjustmentsPage(WebDriver driver) {
        this.driver = driver;


    }


    public void ClickFilters() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Filters).click();
    }

    public void ClickClearFilters() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(ClearFilters).click();
    }

    //Chart Settings
    public void ClickChartSettings() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(ChartSettings).click();
    }

    public void SelectTarget() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Target).click();
    }

    public void SelectCurrentYearNet() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYearNet).click();
    }

    public void SelectPreviousYearNet() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PreviousYearNet).click();
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

    public void SelectAbsolute() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Absolute).click();
    }

    public void SelectNet() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Net).click();
    }
    public void ClickTableSettingsAdjustments() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(TableSettingsAdjustments).click();
    }
    public void SelectPostive() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Positive).click();
    }
    public void SelectNegative() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Negative).click();
    }
    public void HoverOverChart() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //WebElement element = driver.findElement(By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]"));
        WebElement element = driver.findElement(By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
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
        driver.findElement(By.xpath("//div/div[2]/div[3]/div/button[4]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//div[2]/div/div/div/div/label[1]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div/label[1]/input")).click();

    }
    public void SelectYear() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/div[3]/div/button[4]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Year).isSelected();
    }
    public void  LogOut(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Arrow).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LogOutButton).click();


    }
}