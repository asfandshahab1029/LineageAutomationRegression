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
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;
import java.time.Month;
import java.util.concurrent.TimeUnit;

public class VolumePage {
    WebDriver driver;

    By Inbound = By.xpath("//div[2]/div/div/div/div/label[1]/input");
    By Outbound = By.xpath("//div[2]/div/div/div/div/label[2]/input");
    By Total = By.xpath("//div[2]/div/div/div/div/label[3]/input");

    By AvgCasesInfo = By.xpath("//div/div[2]/div[2]/div[1]/div/div[2]/div[2]");
    By AvgWeightPerPalletsInfo = By.xpath("//div/div[2]/div[2]/div[1]/div/div[3]/div[2]");

    By Filters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[1]/button");
    By ClearFilters = By.xpath("//div/div[2]/div[1]/div/div[2]/div/div[2]/button");
    //Chart Settings
    By ChartSettings = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/button");

    //Add or Remove
    By CurrentYearBudget = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]");
    By CurrentYearProjected = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]");
    By CurrentYearFinished = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]");
    By PreviousYearFinished = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[4]");
    //Units
    By Loads = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[1]");
    By Pallets = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[2]");
    By Cases = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[3]");
    By Weight = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[4]");


    //Views
    By Standard = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[1]/input");
    By Cumulative = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[2]/input");
    //TableSettings
    By Units = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By Finished = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");
    By Projected = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    By Budget = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[4]/input");
    By Customer = By.xpath("//div/div[2]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]");
    By TopCustomersFinished = By.xpath("//div/div[2]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]");
    By BudgetMTD = By.xpath("//div/div[2]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]");
    By VarianceMTD = By.xpath("//div/div[2]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[4]");
    By BudgetEOM = By.xpath("//div/div[2]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[5]");
    By VarianceMOM = By.xpath("//div/div[2]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[6]");
    By ProjectedEOM = By.xpath("//div/div[2]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[7]");
    By PercentageTotal = By.xpath("//div/div[2]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[8]");

    //Time Interval
    By Next = By.xpath("//div/div[2]/div[3]/div/button[3]");
    By Back = By.xpath("//div/div[2]/div[3]/div/button[2]");
    By Refresh = By.xpath("//div/div[2]/div[3]/div/button[1]");
    By Week = By.xpath("//div[3]/div/div/div/div/label[1]/input");
    By Month = By.xpath("//div[3]/div/div/div/div/label[2]/input");
    By Year = By.xpath("//div[3]/div/div/div/div/label[3]/input");


    public VolumePage(WebDriver driver) {
        this.driver = driver;


    }

    public void SelectInbound() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/div[1]/div/div[1]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Inbound).click();
    }

    public void SelectOutbound() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/div[1]/div/div[1]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Outbound).click();
    }
    public void SelectTotal() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/div[1]/div/div[1]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Total).click();
    }
    public void ClickAvgCasesInfo() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(AvgCasesInfo).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[2]/div/div[3]/button")).click();
    }

    public void ClickAverageWeightPerPalletInfo() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(AvgWeightPerPalletsInfo).click();
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

    public void SelectCurrentYearBudgeted() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYearBudget).click();
    }
    public void SelectCurrentYearProjected() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYearProjected).click();
    }
    public void SelectCurrentYearFinished() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYearFinished).click();
    }
    public void SelectPreviousYearFinished() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PreviousYearFinished).click();
    }


    public void SelectStandardView() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Standard).click();
    }

    public void SelectCumulativeView() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Cumulative).click();
    }
    //Table Settings
    public void SelectUnits() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Units).click();
    }
    public void SelectFinished() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Finished).click();
    }
    public void SelectProjected() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Projected).click();
    }
    public void SelectBudget() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Budget).click();
    }
    public void SelectCustomer() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Customer).click();
    }
    public void SelectTopCustomersFinished() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(TopCustomersFinished).click();
    }
    public void SelectBudgetMTD() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(BudgetMTD).click();
    }
    public void SelectVarianceMTD() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(VarianceMTD).click();
    }
    public void SelectBudgetEOM() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(BudgetEOM).click();
    }
    public void SelectVarianceMOM() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(VarianceMOM).click();
    }
    public void SelectProjectedEOM() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(ProjectedEOM).click();
    }
    public void SelectPercentageTotal() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PercentageTotal).click();
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