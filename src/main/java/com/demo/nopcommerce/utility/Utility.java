package com.demo.nopcommerce.utility;



import com.demo.nopcommerce.basepage.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;



/**
 * Created by Ankita
 */
public class Utility extends BasePage {

    public static String sameEmail;
    public static String samePassword;

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }


    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }


    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will click on element
     */
    public void clickOnElement(WebElement element) {
        element.click();
    }


    /**
     * This method will get text from element
     */
    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will send text on element
     */

    public void sendTextToElement(WebElement element, String str) {

        element.sendKeys(str);
    }

    // this method will used to sort A to Z and compare with obtained list

    public void sortingAToZ(By by) {

        ArrayList<String> obtainedList = new ArrayList<>();

        List<WebElement> elementList = driver.findElements(by);

        for (WebElement links : elementList) {
            obtainedList.add(links.getText());
        }
        System.out.println("Obtained Product List :" + obtainedList);

        ArrayList<String> sortedList = new ArrayList<>(); // creation of sorting list array

        sortedList.addAll(obtainedList); // adding all list form obtainedblist

        Collections.sort(sortedList); // collections method to sort list

        Assert.assertTrue(obtainedList.equals(sortedList)); // assert of both listy

        System.out.println("Sorted Product List :" + sortedList);
    }

    public void sortingAToZ(WebElement element) {

        ArrayList<String> obtainedList = new ArrayList<>();

        List<WebElement> elementList = Collections.singletonList(element);

        for (WebElement links : elementList) {
            obtainedList.add(links.getText());
        }
        System.out.println("Obtained Product List :" + obtainedList);

        ArrayList<String> sortedList = new ArrayList<>(); // creation of sorting list array

        sortedList.addAll(obtainedList); // adding all list form obtainedblist

        Collections.sort(sortedList); // collections method to sort list

        Assert.assertTrue(obtainedList.equals(sortedList)); // assert of both listy

        System.out.println("Sorted Product List :" + sortedList);
    }


    // this method will used to sort Z to A and compare with obtained list

    public void sortingZToA(By by) {

        ArrayList<String> obtainedList = new ArrayList<>();

        List<WebElement> elementList = driver.findElements(by);

        for (WebElement links : elementList) {
            obtainedList.add(links.getText());
        }
        System.out.println("Obtained Product List :" + obtainedList);

        ArrayList<String> sortedList = new ArrayList<>(); // creation of sorting list array

        sortedList.addAll(obtainedList); // adding all list form obtainedblist

        Collections.sort(sortedList, Collections.reverseOrder()); // collections method to sort list

        Assert.assertEquals(obtainedList, sortedList); // assert of both listy

        System.out.println("Sorted Product List :" + sortedList);
    }

    public void sortingZToA(WebElement element) {

        ArrayList<String> obtainedList = new ArrayList<>();

        List<WebElement> elementList = Collections.singletonList(element);

        for (WebElement links : elementList) {
            obtainedList.add(links.getText());
        }
        System.out.println("Obtained Product List :" + obtainedList);

        ArrayList<String> sortedList = new ArrayList<>(); // creation of sorting list array

        sortedList.addAll(obtainedList); // adding all list form obtainedblist

        Collections.sort(sortedList, Collections.reverseOrder()); // collections method to sort list

        Assert.assertEquals(obtainedList, sortedList); // assert of both listy

        System.out.println("Sorted Product List :" + sortedList);
    }

    public void priceSortingLowToHigh() {
        //Select select = new Select(driver.findElement(By.className("product-grid")));
        // select.selectByVisibleText("Price - Low to High");
        List<WebElement> price = driver.findElements(By.className("product-grid"));
        System.out.println(price.size());

        //List ourAl = new ArrayList<>();
        for (int i = 0; i < price.size(); i = i + 1) {
            System.out.println(price.get(i).getText());

        }
    }




    // this method is for finding the elements and count of links of page

    public void elementsAndLinkCount(By by) {

        List<WebElement> links = driver.findElements(by);

        System.out.println(links.size());

        for (int i = 0; i <= links.size(); i = i + 1) {

            System.out.println(links.get(i).getText());

        }
    }



    public void selectByIndexForDropDownElement(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);

    }

    public void selectByValueForDropDownElement(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);

    }

    public void selectByVisibleTextForDropDownElement(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

    }

    public void selectByVisibleTextFromDropDown(WebElement element, String str) {
        Select select = new Select(element);
        select.selectByVisibleText(str);
    }

    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();
    }

    //this method need to use when we want to create random email and register in demo site
    public void enterRandomEmail(By by) {
        Random anyEmail = new Random();
        int randomInt = anyEmail.nextInt(1000);
        sameEmail = "Tajmahal" + randomInt + "@gmail.com";
        driver.findElement(by).sendKeys(sameEmail);


    }

    public void enterRandomEmail(WebElement element) {
        Random anyEmail = new Random();
        int randomInt = anyEmail.nextInt(1000);
        sameEmail = "Tajmahal" + randomInt + "@gmail.com";
        element.sendKeys(sameEmail);


    }

    //this method we need to use when we want to use stored email id like above email stored
    public void enterStoredEmailToNextField(By by, String str) {
        str = sameEmail;
        driver.findElement(by).sendKeys(str);

    }

    //this method we need to use when we want to enter random password many time
    public void enterRandomPassword(By by) {
        Random anyPassword = new Random();
        int randomInt = anyPassword.nextInt(1000);
        samePassword = "Tajmahal" + randomInt;
        driver.findElement(by).sendKeys(samePassword);
    }

    //this method we need to use to enter stored password like above password
    public void enterStoredPasswordToNextField(By by, String pass) {
        pass = samePassword;
        driver.findElement(by).sendKeys(pass);

    }
    public void waitUntilPresenceOfElementLocated(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void waitUntilPresenceOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void waitUntilVisibilityOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));


    }
    /**
     * This method will returns list of web elements
     */
    public List<WebElement> webElementList(By by) {
        return driver.findElements(by);
    }

    /**
     * This method will generate random string
     */
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    /**
     * This method will take screen shot
     */
    public static void takeScreenShot() {
        String filePath = System.getProperty("user.dir") + "/src/main/java/demo/nopcommerce/screenshots";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1, new File(filePath + getRandomString(10) + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method will take screen shot
     */
    public static String currentTimeStamp(){
        Date d = new Date();
        return d.toString().replace(":", "_").replace(" ", "_");
    }
    /**
     * This method will take screen shot
     */
    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "/src/main/java/com/demo/nopcommerce/screenshots" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
    /**
     * This method will take screen shot
     */
    public static String takeScreenShot(String fileName) {
        String filePath = System.getProperty("user.dir") + "/test-output/html/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        String imageName = fileName+currentTimeStamp()+".jpg";
        String destination = filePath + imageName;
        try {
            FileUtils.copyFile(scr1, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
}
