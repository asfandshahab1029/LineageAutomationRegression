package Tests;

import Pages.FinancialPages.EbitdarPage;
import Pages.KpiTab;
import Pages.MetricsOneHomePage;
import Pages.OperationsPages.VolumePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class UserSettingsModalTests {

    @Test
    public void ClickUserSettingsModal() {

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
        //Click Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();

        //User Settings Modal
        volumePage.ClickUserSettingsModal();
        volumePage.ClickCancel();


        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void ClickUserSettingsModalX() {

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
        //Click Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();

        //User Settings Modal
        volumePage.ClickUserSettingsModal();
        volumePage.ClickX();


        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void ChangingTheDateFormat() {

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
        //Click Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();

        //User Settings Modal
        volumePage.ClickUserSettingsModal();
        volumePage.SelectDMY();
        volumePage.ClickSave();
        volumePage.ClickUserSettingsModal();
        volumePage.SelectMDY();
        volumePage.ClickSave();
        volumePage.ClickUserSettingsModal();
        volumePage.SelectYMD();
        volumePage.ClickSave();


        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void ChangeTheTimeFormat() {

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
        //Click Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();

        //User Settings Modal
        volumePage.ClickUserSettingsModal();
        volumePage.SelectTwentyFourHourTime();
        volumePage.ClickSave();
        volumePage.ClickUserSettingsModal();
        volumePage.SelectTweleveHourTime();
        volumePage.ClickSave();

        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
    @Test
    public void ChangeTheWeightAndMassFormat() {

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
        //Click Volume KPI
        metricsOneHomePage.ClickKPI();
        kpiTab.ClickVolume();

        //User Settings Modal
        volumePage.ClickUserSettingsModal();
        volumePage.SelectPounds();
        volumePage.ClickSave();
        volumePage.ClickUserSettingsModal();
        volumePage.SelectKilograms();
        volumePage.ClickSave();

        volumePage.LogOut();
        driver.close();
        driver.quit();


    }
}