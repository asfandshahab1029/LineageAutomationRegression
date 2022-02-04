package Pages;

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
import java.util.concurrent.TimeUnit;

public class MetricsOneHomePage {
     WebDriver driver;

     By GearIcon = By.xpath("//div/div[1]/div[1]/div/div[1]/button[1]");
     By Email = By.id("1-email");
     By OktaUsername = By.id("okta-signin-username");
     By OktaPassword = By.id("okta-signin-password");
     By Arrow = By.xpath("//div/div[1]/div[1]/div/div[1]/button[4]");
     By PageTitleArrow = By.xpath("//div/div[1]/div[1]/a/div[3]");
     By Okta = By.xpath("//div[2]/div/div/ul/li[2]");
     By LogOutButton = By.xpath("//div[2]/div/div/ul/li[3]");
     By Location = By.xpath("//div/div[1]/div[2]/div[1]/a[1]");
     By KPI = By.xpath("//div/div[1]/div[2]/div[1]/a[2]");
     By Allentown = By.xpath("//div/div[1]/div[2]/div[2]/div[2]/div[2]/div[12]/a");


public MetricsOneHomePage(WebDriver driver){
    this.driver=driver;


}
    public void  MetricsOnePage(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/facilities/g1/composite_score?timestamp=20211006&viewtype=year");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    public void  DetroitLabsUser(){
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.findElement(Email).sendKeys("lineage@detroitlabs.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//div/div[2]/form/div/div/div/button/span")).click();

    }
    public void  DetroitLabsUserOkta (){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(OktaUsername).sendKeys("lineage@detroitlabs.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(OktaPassword).sendKeys("Supersecretpassword313!");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("okta-signin-submit")).click();

    }
    public void  HanSolo(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Email).sendKeys("hsolo@lineagelogistics.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/form/div/div/div/button/span")).click();

    }
    public void  HanSoloOkta (){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(OktaUsername).sendKeys("hsolo@lineagelogistics.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(OktaPassword).sendKeys("c8Nr9xhZw2Fe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("okta-signin-submit")).click();

    }
    public void  PrincessLeia(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Email).sendKeys("pleia@lineagelogistics.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/form/div/div/div/button/span")).click();

    }
    public void  PrincessLeiaOkta(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(OktaUsername).sendKeys("pleia@lineagelogistics.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(OktaPassword).sendKeys("9aQ2pr6Nct,f");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("okta-signin-submit")).click();

    }
    public void  LukeSkywalker(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Email).sendKeys("lskywalker@lineagelogistics.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/form/div/div/div/button/span")).click();

    }
    public void  LukeSkywalkerOkta(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(OktaUsername).sendKeys("lskywalker@lineagelogistics.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(OktaPassword).sendKeys("VFhcBoR72A9D");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("okta-signin-submit")).click();

    }
    public void  LogOut(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Arrow).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LogOutButton).click();


    }
    public void  ClickLocation(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Location).click();
    }
    public void  SelectAllentown(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Allentown).click();
    }
    public void  ClickKPI(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(KPI).click();
    }
    public void  ClickPageTitleArrow(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PageTitleArrow).click();
    }

}




