package Tests;

import Pages.FinancialPages.EbitdarPage;
import Pages.FinancialPages.LaborToRevenuePage;
import Pages.KpiTab;
import Pages.MetricsOneHomePage;
import Pages.OperationsPages.InventoryAdjustmentsPage;
import Pages.OperationsPages.VolumePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class VolumeTests {

    @Test
    public void VolumePage() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        VolumePage volumePage = new VolumePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Click Inventory Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();


        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void VolumeInboundPage() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        VolumePage volumePage = new VolumePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Click Inventory Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();
        //Select Inbound
        volumePage.SelectInbound();


        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void VolumeInboundChartAndTable() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        VolumePage volumePage = new VolumePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Click Inventory Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();
        //Select Inbound
        volumePage.SelectInbound();

        //Validate Chart Settings
        volumePage.ClickChartSettings();
        volumePage.SelectCurrentYearBudgeted();
        volumePage.SelectCurrentYearProjected();
        volumePage.SelectCurrentYearFinished();
        volumePage.SelectPreviousYearFinished();

        //Changing the Units on the Chart
        volumePage.SelectLoads();
        volumePage.SelectPallets();
        volumePage.SelectCases();

        //Changing Views
        volumePage.SelectCumulativeView();
        volumePage.SelectStandardView();

        //Table Settings
        volumePage.ClickTableSettings();
        volumePage.SelectUnits();
        volumePage.SelectFinished();
        volumePage.SelectProjected();
        volumePage.SelectBudget();



        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void VolumeOutboundPage() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        VolumePage volumePage = new VolumePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Click Inventory Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();
        //Select Outbound
        volumePage.SelectOutbound();

        //Validate Chart Settings
        volumePage.ClickChartSettings();
        volumePage.SelectCurrentYearBudgeted();
        volumePage.SelectCurrentYearProjected();
        volumePage.SelectCurrentYearFinished();
        volumePage.SelectPreviousYearFinished();

        //Changing the Units on the Chart
        volumePage.SelectLoads();
        volumePage.SelectPallets();
        volumePage.SelectCases();

        //Changing Views
        volumePage.SelectCumulativeView();
        volumePage.SelectStandardView();

        //Table Settings
        volumePage.ClickTableSettings();
        volumePage.SelectUnits();
        volumePage.SelectFinished();
        volumePage.SelectProjected();
        volumePage.SelectBudget();


        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void VolumeOutboundChartAndTable() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        VolumePage volumePage = new VolumePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Click Inventory Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();
        //Select Outbound
        volumePage.SelectOutbound();


        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void VolumeYearView() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        VolumePage volumePage = new VolumePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Click Inventory Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();

        //Year View
        volumePage.SelectYear();

        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void VolumeMonthView() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        VolumePage volumePage = new VolumePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Click Inventory Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();

        //Year View
        volumePage.SelectYear();
        volumePage.SelectMonth();

        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void VolumeDayView() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        VolumePage volumePage = new VolumePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Click Inventory Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();

        //Year View
        volumePage.SelectDay();

        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void VolumeWeekView() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        VolumePage volumePage = new VolumePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Click Inventory Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();

        //Year View
        volumePage.SelectWeek();

//        volumePage.LogOut();
//        driver.close();
//        driver.quit();


    }
    @Test
    public void VolumeChartSettings() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        VolumePage volumePage = new VolumePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Click Inventory Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();

        //Validate Chart Settings
        volumePage.ClickChartSettings();
        volumePage.SelectCurrentYearBudgeted();
        volumePage.SelectCurrentYearProjected();
        volumePage.SelectCurrentYearFinished();
        volumePage.SelectPreviousYearFinished();

        //Changing the Units on the Chart
        volumePage.SelectLoads();
        volumePage.SelectPallets();
        volumePage.SelectCases();

        //Changing Views
        volumePage.SelectCumulativeView();
        volumePage.SelectStandardView();


        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void VolumeTableSettings() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        VolumePage volumePage = new VolumePage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Click Inventory Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();

        //Table Settings
        volumePage.ClickTableSettings();
        volumePage.SelectUnits();
        volumePage.SelectFinished();
        volumePage.SelectProjected();
        volumePage.SelectBudget();


        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
}
