package com.indra.actions;


import com.indra.pages.DatePage;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://webdriveruniversity.com")

public class DateActions extends DatePage {
    public DateActions(WebDriver driver) {
        super(driver);
    }

    public void openCalendar(){
        getCalendarOptions().click();
        getSelectYM().click();
        getMonthFebruary().click();
        getDay21().click();
    }
}
