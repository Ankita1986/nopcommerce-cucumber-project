package com.demo.nopcommerce.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ankita
 */
public class BasePage {

    public static WebDriver driver;

    public BasePage(){
        PageFactory.initElements(driver, this);
        PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/java/com/demo/nopcommerce/recources/log4j.properties");

    }

}
