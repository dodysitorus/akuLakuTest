package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.utils.DriverFactory;
import org.example.utils.Waitility;
import java.util.List;

public class KegiatanPages {
    public List<WebElement> listOfVideos() {
        String listVideos = "//div[@class='flex justify-center']//a[@href]";
        Waitility.waitForElements(By.xpath(listVideos));
        return DriverFactory.getDriver().findElements(By.xpath(listVideos));
    }


    public void clickPagination(String paginationText) {
        String dynamicXPath = String.format("//div[@class='flex justify-center']//li//*[contains(text(), '%s')]",
                paginationText);
        WebElement paginations = DriverFactory.getDriver().findElement(By.xpath(dynamicXPath));
        paginations.click();
    }

    public void fillSearchBar(String query) {
        String searchBar = "//input[contains(@class,'placeholder')]";
        WebElement searchBarElement = DriverFactory.getDriver().findElement(By.xpath(searchBar));
        searchBarElement.click();
        searchBarElement.sendKeys(query);
    }

    public List<WebElement> listOfResultSearch() {
        String listResult = "//div[@class='m-[10px]']//div[contains(@class, 'justify-between') and contains(@class, 'cursor-pointer')]";
        Waitility.waitForElements(By.xpath(listResult));
        return DriverFactory.getDriver().findElements(By.xpath(listResult));
    }
}
