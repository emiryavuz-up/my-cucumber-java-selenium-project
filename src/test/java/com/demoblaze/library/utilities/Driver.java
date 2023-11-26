package com.demoblaze.library.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

   private Driver(){}

   private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

   public static WebDriver getDriver(){

       if(driverPool.get() == null){ // get the current thread and check if it's null

           String browserType = ConfigurationReader.getProperty("browser");

           switch (browserType){
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driverPool.set(new ChromeDriver());
                   driverPool.get().manage().window().maximize();
                   driverPool.get().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
                   break;

               case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driverPool.set(new FirefoxDriver());
                   driverPool.get().manage().window().maximize();
                   driverPool.get().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
                   break;
           }


       }
       return driverPool.get();
   }

   public static void closeDriver(){

       if(driverPool.get() != null){
           driverPool.get().quit();
           driverPool.set(null);

       }

   }


}
