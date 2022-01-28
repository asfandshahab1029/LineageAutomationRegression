package Tests;

import Pages.FinancialPages.EbitdarPage;
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


public class InventoryAdjustmentsTests {

    @Test
    public void InventoryAdjustmentsPage() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        InventoryAdjustmentsPage inventoryAdjustmentsPage = new InventoryAdjustmentsPage(driver);

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
        kpiTab.ClickInventoryAdjustments();


        inventoryAdjustmentsPage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void InventoryAdjustmentsMonthView() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        InventoryAdjustmentsPage inventoryAdjustmentsPage = new InventoryAdjustmentsPage(driver);

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
        kpiTab.ClickInventoryAdjustments();
        //Selecting Month View
        inventoryAdjustmentsPage.SelectMonth();
        inventoryAdjustmentsPage.ClickBack();
        //Hover Over the chart to validate proper data is displaying
        inventoryAdjustmentsPage.HoverOverChart();


//        inventoryAdjustmentsPage.LogOut();
//        driver.close();
//        driver.quit();


    }
    @Test
    public void InventoryAdjustmentsYearView() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        InventoryAdjustmentsPage inventoryAdjustmentsPage = new InventoryAdjustmentsPage(driver);

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
        kpiTab.ClickInventoryAdjustments();
        //Selecting Past Year View

        inventoryAdjustmentsPage.ClickBack();
        //Hover Over the chart to validate proper data is displaying
        inventoryAdjustmentsPage.HoverOverChart();

        inventoryAdjustmentsPage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void InventoryAdjustmentsValidateTableSettings() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        InventoryAdjustmentsPage inventoryAdjustmentsPage = new InventoryAdjustmentsPage(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Click Inventory Adjustments KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickInventoryAdjustments();
        //Valdiate Table Settings Accuracy
        inventoryAdjustmentsPage.ClickTableSettings();
        inventoryAdjustmentsPage.SelectPeriod();
        inventoryAdjustmentsPage.SelectAbsolute();
        inventoryAdjustmentsPage.SelectNet();

        //Validate Table Settings Adjustment
        inventoryAdjustmentsPage.ClickTableSettingsAdjustments();
        inventoryAdjustmentsPage.SelectPostive();
        inventoryAdjustmentsPage.SelectNegative();

//        inventoryAdjustmentsPage.LogOut();
//        driver.close();
//        driver.quit();


    }

}