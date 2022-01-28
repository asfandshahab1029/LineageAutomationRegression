package Tests;

import Pages.FinancialPages.EbitdarPage;
import Pages.KpiTab;
import Pages.MetricsOneHomePage;
import Pages.OperationsPages.InventoryAdjustmentsPage;
import Pages.OperationsPages.InventoryTurnsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class InventoryTurnsTests {

    @Test
    public void InventoryTurnsPage() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        InventoryTurnsPage inventoryTurnsPage = new InventoryTurnsPage(driver);

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
        kpiTab.ClickInventoryTurns();


        inventoryTurnsPage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void ClickingTheInfoButtons() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        InventoryTurnsPage inventoryTurnsPage = new InventoryTurnsPage(driver);

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
        kpiTab.ClickInventoryTurns();

        //Inventory Turns Info
        inventoryTurnsPage.ClickInventoryTurnsInfo();
//        inventoryTurnsPage.ClickAvgStandingInventoryInfo();
//        inventoryTurnsPage.ClickInventoryTurnoverPeriodInfo();


//        inventoryTurnsPage.LogOut();
//        driver.close();
//        driver.quit();


    }
    @Test
    public void ValidateChartSettings() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        InventoryTurnsPage inventoryTurnsPage = new InventoryTurnsPage(driver);

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
        kpiTab.ClickInventoryTurns();

        //Validating Chart Settings
        inventoryTurnsPage.ClickChartSettings();
        inventoryTurnsPage.SelectCurrentYearInventoryTurns();
        inventoryTurnsPage.SelectPreviousYearInventoryTurns();
        inventoryTurnsPage.SelectCurrentYearAvgStandingInventory();
        inventoryTurnsPage.SelectPreviousYearAvgStandingInventory();



        inventoryTurnsPage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void ValidateTableSettings() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        InventoryTurnsPage inventoryTurnsPage = new InventoryTurnsPage(driver);

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
        kpiTab.ClickInventoryTurns();

        //Validating Table Settings
        inventoryTurnsPage.ClickTableSettings();
        inventoryTurnsPage.SelectPeriod();
        inventoryTurnsPage.SelectInventoryTurnsAnnualize();
        inventoryTurnsPage.SelectAvgStandingInventoryPallets();
        inventoryTurnsPage.SelectTurnoverPeriodDays();



//        inventoryTurnsPage.LogOut();
//        driver.close();
//        driver.quit();


    }
    @Test
    public void ValidateFilteringWithCustomerName() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        InventoryTurnsPage inventoryTurnsPage = new InventoryTurnsPage(driver);

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
        kpiTab.ClickInventoryTurns();

        //Validating Filtering with Customer Name
        inventoryTurnsPage.ClickFilters();
        inventoryTurnsPage.SearchCustomer();



//        inventoryTurnsPage.LogOut();
//        driver.close();
//        driver.quit();


    }


}