package Tests;

import Pages.LaborKpiPages.HourlyLaborPage;
import Pages.LocationsTab;
import Pages.MetricsOneHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationSmokeTest {
    @Test
    public void NavigatingBetweenLocationsAndKPI()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        LocationsTab locationsTab = new LocationsTab(driver);

        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.DetroitLabsUser();

        //Okta
        metricsOneHomePage.DetroitLabsUserOkta();

        //Click Page Title Arrow
        metricsOneHomePage.ClickPageTitleArrow();

        //Clicking KPI and Location & Verifying Location and KPI icons
        metricsOneHomePage.ClickKPI();
        locationsTab.ClickLocation();

        metricsOneHomePage.LogOut();

        driver.close();
        driver.quit();


    }

    @Test
    public void NavigatingWithLocations()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        MetricsOneHomePage metricsOneHomePage = new MetricsOneHomePage(driver);
        LocationsTab locationsTab = new LocationsTab(driver);


        metricsOneHomePage.MetricsOnePage();
        metricsOneHomePage.DetroitLabsUser();

        //Okta
        metricsOneHomePage.DetroitLabsUserOkta();

        //Click Page Title Arrow, Composite Score is visible
        metricsOneHomePage.ClickPageTitleArrow();


        //Clicking the Location List and Going through Hierarchy
        locationsTab.LocationHierarchy();
        metricsOneHomePage.ClickPageTitleArrow();



//        //Search Location Name & Clicking Location
//        metricsOneHomePage.ClickPageTitleArrow();
//        locationsTab.SearchLocation();
//        locationsTab.ClickingSpecificLocation();
//
//
//
//
//        //Search with Cost Center ID & Clicking Location
//        metricsOneHomePage.ClickPageTitleArrow();
//        locationsTab.ClearLocation();
//        locationsTab.SearchCostCenterID();
//        locationsTab.ClickingCostIdLocation();


//        metricsOneHomePage.LogOut();
//
//        driver.close();
//        driver.quit();


    }
}
