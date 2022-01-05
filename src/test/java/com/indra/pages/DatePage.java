package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://webdriveruniversity.com/Datepicker/")

public class DatePage extends PageObject {
    public DatePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//i[contains(@class,'glyphicon glyphicon-calendar')]")
    private WebElementFacade calendarOptions;

    @FindBy(xpath = "(//th[@class='prev'][contains(.,'«')])[1]")
    private WebElementFacade previous;

    @FindBy(xpath = "(//th[@class='next'][contains(.,'»')])[1]")
    private WebElementFacade next;

    @FindBy(xpath = "//th[@colspan='5'][contains(.,' ')]")
    private WebElementFacade selectYM;

    @FindBy(xpath = "(//th[@colspan='5'][contains(.,'')])[2]")
    private WebElementFacade year;

    @FindBy(xpath = "//span[@class='month'][contains(.,'')]")
    private WebElementFacade month;

    @FindBy(xpath = "//td[@class='day'][contains(.,'')]")
    private WebElementFacade day;

    @FindBy(xpath = "//td[@class='day'][contains(.,'21')]")
    private WebElementFacade day21;

    @FindBy(xpath = "//span[@class='month'][contains(.,'Jul')]")
    private WebElementFacade monthFebruary;

    public WebElementFacade getCalendarOptions() {
        return calendarOptions;
    }

    public WebElementFacade getPrevious() {
        return previous;
    }

    public WebElementFacade getNext() {
        return next;
    }

    public WebElementFacade getSelectYM() {
        return selectYM;
    }

    public WebElementFacade getYear() {
        return year;
    }

    public WebElementFacade getMonth() {
        return month;
    }

    public WebElementFacade getDay() {
        return day;
    }

    public WebElementFacade getDay21() {
        return day21;
    }

    public WebElementFacade getMonthFebruary() {
        return monthFebruary;
    }
}

