package com.sauce.demo.sw6.cucumber.pages;

import com.aventstack.extentreports.Status;
import com.sauce.demo.sw6.cucumber.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;


public class InventoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(InventoryPage.class.getName());
    @CacheLookup
    @FindBy(className = "title")
    WebElement productsText;

    public String getProductText() {
        log.info("Verify Text from Webpage");
        return getTextFromElement(productsText);

    }
    public int findActualNumberOfProducts() {

        List<WebElement> productList = findElementsFromWebPage(By.xpath("//img[starts-with(@class,'inventory_item_img')]"));
        log.info("Find humber of Products");
        return productList.size();
    }

}
