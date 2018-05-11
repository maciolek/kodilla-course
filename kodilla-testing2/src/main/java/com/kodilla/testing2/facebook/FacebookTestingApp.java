package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_DAY = "//select[contains(@name, \"birthday_day\")]";
    public static final String XPATH_SELECT_MONTH = "//select[contains(@name, \"birthday_month\")]";
    public static final String XPATH_SELECT_YEAR = "//select[contains(@name, \"birthday_year\")]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://pl-pl.facebook.com/");

        WebElement selectComboDays = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoardDays = new Select(selectComboDays);
        selectBoardDays.selectByIndex(23);

        WebElement selectComboMonths = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoardsMonths = new Select(selectComboMonths);
        selectBoardsMonths.selectByIndex(8);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoardsYear = new Select(selectComboYear);
        selectBoardsYear.selectByValue("1982");
    }
}
