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

public class HourlyLaborPage {
    WebDriver driver;

    By Hours = By.xpath("//div[2]/div/div/div/div/label[1]/input");
    By Dollars = By.xpath("//div[2]/div/div/div/div/label[2]/input");
    By ProjectTotalLaborHoursInfo = By.xpath("//div/div[2]/div[2]/div[1]/div/div[3]/div[2]");
    By ProjectOtHoursInfo = By.xpath("//div/div[2]/div[2]/div[1]/div/div[4]/div[2]");
    By Filters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[1]/button");
    By ClearFilters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[2]/button");
    //Chart Settings
    By ChartSettings = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/button");
    //Views
    By Standard = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[1]/input");
    By Cumulative = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[2]/input");
    //Type
    By Total = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/div[2]/label[1]/input");
    By Indirect = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/div[2]/label[2]/input");
    By Direct = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/div[2]/label[3]/input");
    //Time Interval
    By Next = By.xpath("//div/div[2]/div[3]/div/button[3]");
    By Back = By.xpath("//div/div[2]/div[3]/div/button[2]");
    By Refresh = By.xpath("//div/div[2]/div[3]/div/button[1]");
    By Week = By.xpath("//div[3]/div/div/div/div/label[1]/input");
    By Month = By.xpath("//div[3]/div/div/div/div/label[2]/input");
    By Year = By.xpath("//div[3]/div/div/div/div/label[3]/input");


    public HourlyLaborPage(WebDriver driver) {
        this.driver = driver;


    }

    public void SelectHours() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/div[1]/div/div[1]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Hours).click();
    }

    public void SelectDollars() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/div[1]/div/div[1]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Dollars).click();
    }

    public void ClickProjectTotalLaborHoursInfo() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(ProjectTotalLaborHoursInfo).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[2]/div/div[3]/button")).click();
    }

    public void ClickProjectOtHoursInfo() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(ProjectOtHoursInfo).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[2]/div/div[1]/button")).click();


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

    public void SelectStandardView() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Standard).click();
    }

    public void SelectCumulativeView() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Cumulative).click();
    }

    public void SelectTotalType() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Total).click();
    }

    public void SelectIndirectType() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Indirect).click();
    }

    public void SelectDirectType() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Direct).click();
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