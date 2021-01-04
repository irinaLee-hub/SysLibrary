package com.sys_Library.utilities.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver(){}

private static ThreadLocal<WebDriver>driverPool=new ThreadLocal<>();

    public static synchronized WebDriver getDriver(){

        if(driverPool.get()==null){

            String browser =System.getProperty("browser")!= null? System.getProperty("browser"):
                    ConfigurationReader.getProperty("browser");
            switch (browser){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set((new ChromeDriver()));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    break;


            }

        }
        return driverPool.get();

    }

    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
}

}

