package com.example.stepDefinitions;

import org.example.pages.KegiatanPages;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

public class KegiatanPageSteps {
    private final KegiatanPages kegiatanPages = new KegiatanPages();

    @And("[user] verify that the list of videos on Kegiatan Page of the Akulaku website is should be {int} items")
    public void userVerifyThatTheListOfVideosOnKegiatanPageOfTheAkulakuWebsiteIsShouldBeItems(int expectedCount) {
        List<WebElement> listofVideos = kegiatanPages.listOfVideos();
        Integer countOfVideos = listofVideos.size();
        System.out.println("Actual count of videos: "+ countOfVideos);
        assertThat("wrong assertion for count of videos", countOfVideos, equalTo(expectedCount));
    }

    @And("[user] navigates to next page by clicking {string} on pagination of the Kegiatan Page on the Akulaku website")
    public void userNavigatesToNextPageByClickingOnPaginationOfTheKegiatanPageOnTheAkulakuWebsite(String pagination) {
        kegiatanPages.clickPagination(pagination);
    }

    @And("[user] fills {string} into the search bar on Kegiatan Page of the Akulaku website")
    public void userFillsIntoTheSearchBarOnKegiatanPageOfTheAkulakuWebsite(String query) {
        kegiatanPages.fillSearchBar(query);
    }

    @And("[user] verifies that the list of search suggestions in the search bar on Kegiatan Page of the Akulaku website is should be {int} items")
    public void userVerifiesThatTheListOfSearchSuggestionsInTheSearchBarOnKegiatanPageOfTheAkulakuWebsiteIsShouldBeItems(int expectedCount) {
        List<WebElement> listofResult = kegiatanPages.listOfResultSearch();
        Integer countOfResult = listofResult.size();
        System.out.println("Actual count of suggestions: "+ countOfResult);
        assertThat("wrong assertion for count of videos", countOfResult, equalTo(expectedCount));
    }
}
