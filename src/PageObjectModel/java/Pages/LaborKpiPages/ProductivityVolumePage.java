package Pages.LaborKpiPages;

import net.bytebuddy.description.NamedElement;
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
import java.time.Month;
import java.util.concurrent.TimeUnit;

public class ProductivityVolumePage {
    WebDriver driver;

    By Ttm = By.xpath("//div[2]/div/div/div/div/label[1]/input");
    By Ytd = By.xpath("//div[2]/div/div/div/div/label[2]/input");
    By Filters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[1]/button");
    By ClearFilters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[2]/button");
    //Chart Settings
    By ChartSettings = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/button");
    By CurrentYearTtm = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By PreviousYearTtm = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");
    By Target = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    By CurrentYearTO = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[4]/input");
    By PreviousYearTO = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[5]/input");

    //Table Settings
    By Period = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By TO = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");
    By HcAvg = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    By TOAnnualized = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[4]/input");


    //Time Interval
    By Next = By.xpath("//div/div[2]/div[3]/div/button[3]");
    By Back = By.xpath("//div/div[2]/div[3]/div/button[2]");
    By Refresh = By.xpath("//div/div[2]/div[3]/div/button[1]");
    By Week = By.xpath("//div[3]/div/div/div/div/label[1]/input");
    By Month = By.xpath("//div[3]/div/div/div/div/label[2]/input");
    By Year = By.xpath("//div[3]/div/div/div/div/label[3]/input");


    public ProductivityVolumePage(WebDriver driver) {
        this.driver = driver;


    }

    public void SelectHours() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/div[1]/div/div[1]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Ttm).click();
    }

    public void SelectDollars() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/div[1]/div/div[1]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Ytd).click();
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

    public void SelectCurrentYear() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYearTtm).click();
    }

    public void SelectPreviousYear() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PreviousYearTtm).click();
    }

    public void SelectBudget() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Target).click();
    }
    public void SelectPallets() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYearTO).click();
    }
    public void SelectCases() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PreviousYearTO).click();
    }

    //Table Settings
    public void SelectPeriod() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Period).click();
    }
    public void SelectTO() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(TO).click();
    }
    public void SelectTOAnnualized() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(TOAnnualized).click();
    }
    public void SelectHCAvg() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(HcAvg).click();
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
}