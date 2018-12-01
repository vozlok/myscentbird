package com.myscentbird.pages;

import com.myscentbird.TestBase;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GiftPaymentPage extends TestBase {

    @Step("Check subscription price")
    public GiftPaymentPage checkSubscriptionPrice(String price) {
        $("#billGiftSubscriptionProductRow").shouldHave(text(price));
        return this;
    }

    @Step("Check gift color")
    public GiftPaymentPage checkGiftColor(String gender) {
        if (gender.equals("female")) {
            $(byXpath("//div[@data-testid='caseImagePostponed']/picture/img[contains(@src, 'womenCase')]")).shouldBe(visible);
        } else {
            $(byXpath("//div[@data-testid='caseImagePostponed']/picture/img[contains(@src, 'menCase_241a00')]")).shouldBe(visible);
        }
        return this;
    }
}
