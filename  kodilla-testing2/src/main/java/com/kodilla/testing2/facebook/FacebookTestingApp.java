package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_FIRSTNAME = "//div[contains(@class, \"clearfix _58mh\")]/div[1]/div/div/input";
    public static final String XPATH_LASTNAME = "//div[contains(@class, \"clearfix _58mh\")]/div[2]/div/div/input";
    public static final String XPATH_DAY = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement firstnameField = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        firstnameField.sendKeys("John");

        WebElement lastnameField = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastnameField.sendKeys("Berg");

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoard1 = new Select(selectCombo1);
        selectBoard1.selectByIndex(3);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectBoard2 = new Select(selectCombo2);
        selectBoard2.selectByIndex(9);

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectBoard3 = new Select(selectCombo3);
        selectBoard3.selectByIndex(33);
    }
}
