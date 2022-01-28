package Pages.OperationsPages;

import net.bytebuddy.description.NamedElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.html5.Utils;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import javax.sound.sampled.Line;
import javax.xml.xpath.XPath;
import java.time.Month;
import java.util.concurrent.TimeUnit;

public class PutawayCompliancePage {
    WebDriver driver;


    By Filters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[1]/button");
    By ClearFilters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[2]/button");
    //Chart Settings
    By ChartSettings = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/button");
    By CurrentYearCompliance = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By PreviousYearCompliance = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");
    By Target = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    //Chart Setting Units
    By Standard = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[1]");
    By Cumulative = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[2]");
    //Table Settings
    By Customer = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By CustomerCode = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");
    By Facility = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    By Inbounds = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    By Putaways = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    By Overrides = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    By PalletsPerDay = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    By Compliance = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");

    //Time Interval
    By Next = By.xpath("//div/div[2]/div[3]/div/button[3]");
    By Back = By.xpath("//div/div[2]/div[3]/div/button[2]");
    By Refresh = By.xpath("//div/div[2]/div[3]/div/button[1]");
    By Week = By.xpath("//div[3]/div/div/div/div/label[1]/input");
    By Month = By.xpath("//div[3]/div/div/div/div/label[2]/input");
    By Year = By.xpath("//div[3]/div/div/div/div/label[3]/input");


    public PutawayCompliancePage(WebDriver driver) {
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

    public void SelectCurrentYearSpaceEfficiency() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYearCompliance).click();
    }

    public void SelectPreviousYearMovingAvg() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PreviousYearCompliance).click();
    }

    public void SelectVarianceYOY() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Target).click();
    }
    public void SelectStandard() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Standard).click();
    }
    public void SelectCumulative() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Cumulative).click();
    }
    //Table Settings
    public void SelectCustomer() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Customer).click();
    }

    public void SelectCustomerCode() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CustomerCode).click();
    }

    public void SelectFacility() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Facility).click();
    }
    public void SelectInbounds() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Inbounds).click();
    }
    public void SelectPutaways() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Putaways).click();
    }
    public void SelectOverrides() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Overrides).click();
    }
    public void SelectPalletsPerDay() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PalletsPerDay).click();
    }
    public void SelectCompliance() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Compliance).click();
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