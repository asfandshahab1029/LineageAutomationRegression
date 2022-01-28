package Tests;

import Pages.FinancialPages.EbitdarPage;
import Pages.KpiTab;
import Pages.MetricsOneHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class EbitdarTests {

    @Test
    public void EbitdarPage()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        EbitdarPage ebitdarPage = new EbitdarPage(driver);

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
        //Click Ebitdar KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickEditdar();


        ebitdarPage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void SelectEbitda()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        EbitdarPage ebitdarPage = new EbitdarPage(driver);

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
        //Click Ebitdar KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickEditdar();
        //Select EBITDA
        ebitdarPage.SelectEbitda();


//        ebitdarPage.LogOut();
//        driver.close();
//        driver.quit();


    }
    @Test
    public void SelectEbitdar()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        EbitdarPage ebitdarPage = new EbitdarPage(driver);

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
        //Click Ebitdar KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickEditdar();
        //Select EBITDAR
        ebitdarPage.SelectEbitda();
        ebitdarPage.SelectEbitdar();

        ebitdarPage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void EbitdarValidateChartFunctionalityMonthView()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        EbitdarPage ebitdarPage = new EbitdarPage(driver);


        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();


        //Selecting Allentown
        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        //Click Ebitdar KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickEditdar();
        //Validating the chart settings (Month View)
        ebitdarPage.ClickChartSettings();
        //Removing Current year Budget and Actuals
        ebitdarPage.SelectCurrentYearBudget();
        ebitdarPage.SelectCurrentYearActuals();
        //Selecting Standard & Cumalitve Units
        ebitdarPage.SelectStandard();
        ebitdarPage.SelectCumulative();
        //Hovering over the chart
        ebitdarPage.ClickBack();
        ebitdarPage.HoverOverChart();

        ebitdarPage.LogOut();
        driver.close();
        driver.quit();


    }

    @Test
    public void EbitdarValidateChartFunctionalityYearView()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        EbitdarPage ebitdarPage = new EbitdarPage(driver);


        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();


        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        //Click Ebitdar KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickEditdar();
        //Validating the chart settings
        ebitdarPage.ClickChartSettings();
        //Removing Current year Budget and Actuals
        ebitdarPage.SelectCurrentYearBudget();
        ebitdarPage.SelectCurrentYearActuals();
        //Selecting Standard & Cumalitve Units
        ebitdarPage.SelectStandard();
        ebitdarPage.SelectCumulative();
        //Changing to Month View
        ebitdarPage.ClickDropDownTimeInterval();
        ebitdarPage.SelectYear();
        ebitdarPage.ClickBack();
        //Hovering over the chart
        ebitdarPage.HoverOverChart();

        ebitdarPage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void EbitdarByDayTable()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        EbitdarPage ebitdarPage = new EbitdarPage(driver);


        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();


        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        //Click Ebitdar KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickEditdar();

        //Validate Table Settings
        ebitdarPage.ClickBack();
        ebitdarPage.ClickTableSettings();
        ebitdarPage.SelectDay();
        ebitdarPage.SelectActual();
        ebitdarPage.SelectBudget();
        ebitdarPage.SelectVarianceActual();

        ebitdarPage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void EbitdaValidateChartFunctionalityMonthView()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        EbitdarPage ebitdarPage = new EbitdarPage(driver);


        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();


        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        //Click Ebitdar KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickEditdar();
        //Switch to Edbitda
        ebitdarPage.SelectEbitda();
        //Validating the chart settings (Month View)
        ebitdarPage.ClickChartSettings();
        //Removing Current year Budget and Actuals
        ebitdarPage.SelectCurrentYearBudget();
        ebitdarPage.SelectCurrentYearActuals();
        //Selecting Standard & Cumalitve Units
        ebitdarPage.SelectStandard();
        ebitdarPage.SelectCumulative();
        //Hovering over the chart
        ebitdarPage.ClickBack();
        ebitdarPage.HoverOverChart();

        ebitdarPage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void EbitdaValidateChartFunctionalityYearView()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        EbitdarPage ebitdarPage = new EbitdarPage(driver);


        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();
        driver.manage().window().maximize();


        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        //Click Ebitdar KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickEditdar();
        //Switch to Edbitda
        ebitdarPage.SelectEbitda();
        //Changing to Year View
        ebitdarPage.ClickDropDownTimeInterval();
        ebitdarPage.SelectYear();
        ebitdarPage.ClickBack();
        //Validating the chart settings
        ebitdarPage.ClickChartSettings();
        //Removing Current year Budget and Actuals
        ebitdarPage.SelectCurrentYearBudget();
        ebitdarPage.SelectCurrentYearActuals();
        //Selecting Standard & Cumalitve Units
        ebitdarPage.SelectStandard();
        ebitdarPage.SelectCumulative();
        //Hovering over the chart
        ebitdarPage.HoverOverChart();

        ebitdarPage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void EbitdaByDayTable()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        KpiTab kpiTab = new KpiTab(driver);
        EbitdarPage ebitdarPage = new EbitdarPage(driver);


        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.LukeSkywalker();

        //Okta
        metricsOneHomePage.LukeSkywalkerOkta();


        //Selecting Allentown

        metricsOneHomePage.ClickPageTitleArrow();
        metricsOneHomePage.ClickLocation();
        metricsOneHomePage.SelectAllentown();
        metricsOneHomePage.ClickPageTitleArrow();

        //Click Ebitdar KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickEditdar();
        //Switch to Edbitda
        ebitdarPage.SelectEbitda();
        //Validate Table Settings
        ebitdarPage.ClickBack();
        ebitdarPage.ClickTableSettings();
        ebitdarPage.SelectDay();
        ebitdarPage.SelectActual();
        ebitdarPage.SelectBudget();
        ebitdarPage.SelectVarianceActual();

        ebitdarPage.LogOut();
        driver.close();
        driver.quit();


    }

}




