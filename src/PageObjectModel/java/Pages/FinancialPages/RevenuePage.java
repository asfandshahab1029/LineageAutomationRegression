package Pages.FinancialPages;

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

import javax.sound.sampled.Line;
import javax.xml.xpath.XPath;
import java.time.Month;
import java.util.concurrent.TimeUnit;

public class RevenuePage {
    WebDriver driver;



    By Filters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[1]/button");
    By ClearFilters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[2]/button");

    By RevenueActualInfo = By.xpath("//div/div[2]/div[2]/div[1]/div/div[1]/div[2]");
    By RevenueBudgetInfo = By.xpath("//div/div[2]/div[2]/div[1]/div/div[2]/div[2]");
    By VarianceInfo = By.xpath("//div/div[2]/div[2]/div[1]/div/div[3]/div[2]");
    By RevenueProjectedInfo = By.xpath("//div/div[2]/div[2]/div[1]/div/div[4]/div[2]");

    //Chart Settings
    By ChartSettings = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/button");
    By CurrentYearBudgetPercentage = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]");
    By CurrentYearActualsPercentage = By.xpath("/div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]");
    By CurrentYearProjected = By.xpath("/div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]");
    //Units
    By Standard = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[1]/input");
    By Cumulative = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[2]/input");

    //Table Settings
    By Day = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By Actual = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");
    By Budget = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    By VarianceAcutal = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[4]/input");
    By Projected = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[5]/input");
    By VarianceProjected = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[6]/input");


    //Time Interval
    By Next = By.xpath("//div/div[2]/div[3]/div/button[3]");
    By Back = By.xpath("//div/div[2]/div[3]/div/button[2]");
    By Refresh = By.xpath("//div/div[2]/div[3]/div/button[1]");
    By Week = By.xpath("//div[3]/div/div/div/div/label[1]/input");
    By Month = By.xpath("//div[3]/div/div/div/div/label[2]/input");
    By Year = By.xpath("//div[3]/div/div/div/div/label[3]/input");


    public RevenuePage(WebDriver driver) {
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
    public void ClickRevenueAcutalInfo() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(RevenueActualInfo).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[2]/div/div[3]/button")).click();
    }
    public void ClickRevenueBudgetInfo() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(RevenueBudgetInfo).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[2]/div/div[3]/button")).click();
    }
    public void ClickVarianceInfo() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(VarianceInfo).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[2]/div/div[3]/button")).click();
    }
    public void ClickRevenueProjectedInfo() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(RevenueProjectedInfo).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[2]/div/div[3]/button")).click();
    }

    //Chart Settings
    public void ClickChartSettings() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(ChartSettings).click();
    }

    public void SelectCurrentYearBudgetPercentage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYearBudgetPercentage).click();
    }

    public void SelectCurrentYearActuals() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYearActualsPercentage).click();
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
    public void SelectDay() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Day).click();
    }

    public void SelectActual() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Actual).click();
    }

    public void SelectBudget() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Budget).click();
    }
    public void SelectVarianceActual() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(VarianceAcutal).click();
    }
    public void SelectProjected() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Projected).click();
    }
    public void SelectVarianceProjeceted() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(VarianceProjected).click();
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