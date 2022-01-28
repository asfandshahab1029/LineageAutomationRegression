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

public class TurnoverPage {
    WebDriver driver;

    By Hours = By.xpath("//div[2]/div/div/div/div/label[1]/input");
    By Dollars = By.xpath("//div[2]/div/div/div/div/label[2]/input");
    By ProjectTotalLaborHoursInfo = By.xpath("//div/div[2]/div[2]/div[1]/div/div[3]/div[2]");
    By ProjectOtHoursInfo = By.xpath("//div/div[2]/div[2]/div[1]/div/div[4]/div[2]");
    By Filters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[1]/button");
    By ClearFilters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[2]/button");
    //Chart Settings
    By ChartSettings = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/button");
    By CurrentYear = By.xpath("/div/div[2]/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By PreviousYear = By.xpath("/div/div[2]/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");
    By Budget = By.xpath("/div/div[2]/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    //Units
    By Pallets = By.xpath("//div/div[2]/div[2]/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[1]/input");
    By Cases = By.xpath("//div/div[2]/div[2]/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[2]/input");
    By Weight = By.xpath("//div/div[2]/div[2]/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[3]/input");
    //Table Settings
    By Units = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By PerHour = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");
    By BudgetedPerHour = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");


    //Time Interval
    By Next = By.xpath("//div/div[2]/div[3]/div/button[3]");
    By Back = By.xpath("//div/div[2]/div[3]/div/button[2]");
    By Refresh = By.xpath("//div/div[2]/div[3]/div/button[1]");
    By Week = By.xpath("//div[3]/div/div/div/div/label[1]/input");
    By Month = By.xpath("//div[3]/div/div/div/div/label[2]/input");
    By Year = By.xpath("//div[3]/div/div/div/div/label[3]/input");


    public TurnoverPage(WebDriver driver) {
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

    public void SelectCurrentYear() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYear).click();
    }

    public void SelectPreviousYear() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PreviousYear).click();
    }

    public void SelectBudget() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Budget).click();
    }
    public void SelectPallets() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Pallets).click();
    }
    public void SelectCases() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Cases).click();
    }
    public void SelectWeight() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Weight).click();
    }
    //Table Settings
    public void SelectUnits() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Units).click();
    }
    public void SelectPerHour() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PerHour).click();
    }
    public void SelectBudgetedPerHour() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(BudgetedPerHour).click();
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
