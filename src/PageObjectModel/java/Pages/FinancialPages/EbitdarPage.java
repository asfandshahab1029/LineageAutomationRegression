package Pages.FinancialPages;

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

public class EbitdarPage {
    WebDriver driver;
    By Ebitdar = By.xpath("//div[2]/div/div/div/div/label[1]/input");
    By Ebitda = By.name("//html/body/div[2]/div/div/div/div/label[2]/input");

    //Chart Settings
    By ChartSettings = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/button");
    By CurrentYearBudget = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By CurrentYearActuals = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");
    //Units
    By Standard = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[1]/input");
    By Cumulative = By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/label[2]/input");

    //Table Settings
    By TableSettings = By.xpath("//div/div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/button");
    By Day = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[1]/input");
    By Actual = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[2]/input");
    By Budget = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[3]/input");
    By VarianceActual = By.xpath("//div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/label[4]/input");

    //Time Interval
    By Next = By.xpath("//div/div[2]/div[3]/div/button[3]");
    By Back = By.xpath("//div/div[2]/div[3]/div/button[2]");
    By Refresh = By.xpath("//div/div[2]/div[3]/div/button[1]");
    By DropDown = By.xpath("//div/div/div[2]/div[3]/div/button[4]");

    By Month = By.xpath("//div[3]/div/div/div/div/label[1]/input");
    By Year = By.xpath("//html/body/div[3]/div/div/div/div/label[2]/input");

    By LogOutButton = By.xpath("//html/body/div[3]/div/div/ul/li[3]");
    By Arrow = By.xpath("//div/div[1]/div[1]/div/div[1]/button[4]");


    public EbitdarPage(WebDriver driver) {
        this.driver = driver;


    }
    public void SelectEbitdar() {
        WebElement radio = driver.findElement(Ebitdar);
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions.moveToElement(radio);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions.perform();

        driver.findElement(Ebitdar).click();
    }

    public void SelectEbitda() {
//
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/div[1]/div/div/div/button")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement radio = driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div/label[2]/input"));
        radio.click();





    }


    //Chart Settings
    public void ClickChartSettings() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(ChartSettings).click();
    }

    public void SelectCurrentYearBudget() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYearBudget).click();
    }

    public void SelectCurrentYearActuals() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(CurrentYearActuals).click();
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
    public void ClickTableSettings() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(TableSettings).click();
    }

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
        driver.findElement(VarianceActual).click();
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

    public void SelectMonth() {
        WebElement radio = driver.findElement(Month);
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/div[3]/div/button[4]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions.moveToElement(radio);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions.perform();
    }
    public void SelectYear() {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.findElement(By.id("a")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Year).click();


    }
    public void ClickDropDownTimeInterval(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(DropDown).click();
    }
    public void HoverOverChart() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
    public void  LogOut(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Arrow).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LogOutButton).click();


    }
}