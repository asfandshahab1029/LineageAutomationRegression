package Tests;

import Pages.FinancialPages.EbitdarPage;
import Pages.FinancialPages.LaborToRevenuePage;
import Pages.KpiTab;
import Pages.MetricsOneHomePage;
import Pages.OperationsPages.InventoryAdjustmentsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class LaborToRevenueTests {

    @Test
    public void LaborToRevenuePage() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        LaborToRevenuePage laborToRevenuePage = new LaborToRevenuePage(driver);


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
        //Click Inventory Adjustments KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickLaborToRevenue();


        laborToRevenuePage.LogOut();
        driver.close();
        driver.quit();


    }

    @Test
    public void LaborToRevenueYearView() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        LaborToRevenuePage laborToRevenuePage = new LaborToRevenuePage(driver);

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
        //Click Inventory Adjustments KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickLaborToRevenue();

        //Year View
        laborToRevenuePage.ClickBack();
        laborToRevenuePage.SelectYear();

        laborToRevenuePage.LogOut();
        driver.close();
        driver.quit();

    }

    @Test
    public void LaborToRevenueMonthView() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        LaborToRevenuePage laborToRevenuePage = new LaborToRevenuePage(driver);

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
        //Click Inventory Adjustments KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickLaborToRevenue();

        //Year View
        laborToRevenuePage.ClickBack();
        laborToRevenuePage.SelectYear();

        laborToRevenuePage.LogOut();
        driver.close();
        driver.quit();

    }
    @Test
    public void HooverOverChart() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        LaborToRevenuePage laborToRevenuePage = new LaborToRevenuePage(driver);


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
        //Click Inventory Adjustments KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickLaborToRevenue();

        //Previous Month
        laborToRevenuePage.ClickBack();

        //Hoover Over Chart
        laborToRevenuePage.HooverOverChart();

        laborToRevenuePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void ClickLtrVarianceInfoButton() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        LaborToRevenuePage laborToRevenuePage = new LaborToRevenuePage(driver);


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
        //Click Inventory Adjustments KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickLaborToRevenue();

        //Previous Month
        laborToRevenuePage.ClickBack();

        //Clicking Info button
        laborToRevenuePage.ClickLtrVarianceToBudget();

        laborToRevenuePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void ValidateChartSettings() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        LaborToRevenuePage laborToRevenuePage = new LaborToRevenuePage(driver);


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
        //Click Inventory Adjustments KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickLaborToRevenue();

        //Previous Month
        laborToRevenuePage.ClickBack();

        //Validating Chart Functionality
        laborToRevenuePage.SelectCurrentYearActuals();
        laborToRevenuePage.SelectCurrentYearBudgetPercentage();

        laborToRevenuePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void ValidateTableSettings() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        LaborToRevenuePage laborToRevenuePage = new LaborToRevenuePage(driver);


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
        //Click Inventory Adjustments KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickLaborToRevenue();

        //Previous Month
        laborToRevenuePage.ClickBack();

        //Validating Month Functionality
        laborToRevenuePage.SelectPeriod();
        laborToRevenuePage.SelectReported();
        laborToRevenuePage.SelectVariance();

        laborToRevenuePage.LogOut();
        driver.close();
        driver.quit();


    }
}
