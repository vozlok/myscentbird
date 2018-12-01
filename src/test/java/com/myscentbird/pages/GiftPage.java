package com.myscentbird.pages;

import com.myscentbird.TestBase;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class GiftPage extends TestBase {

    @Step("Open Gift page")
    public GiftPage openGiftPage() {
        open(baseUrl);
        return this;
    }

    @Step("Click to top block BUY GIFT NOW")
    public GiftPage clickToBuyGiftNowTopBlock() {
        $("#buyGiftNow span").click();
        return this;
    }

    @Step("Move mouse Buy For Him")
    public GiftPage moveMouseForHim() {
        $("#buyForHim").hover();
        return this;
    }

    @Step("Click to Buy For Him")
    public GiftPage clickToBuyForHim() {
        $(byXpath("//span[text()='Buy the gift for him']")).click();
        return this;
    }

    @Step("Choose size of gift")
    public GiftPage clickToSizeOfGift(int giftSize) {
        switch (giftSize) {
            case 3: $("#giftSize0Button").click();
                break;
            case 6: $("#giftSize1Button").click();
                break;
            case 12: $("#giftSize2Button").click();
                break;
            default:
                break;
        }
        return this;
    }

    @Step("Fill recipient name")
    public GiftPage setRecipientName(String name) {
        $("#giftModalRecipientName").setValue(name);
        return this;
    }

    @Step("Fill recipient email")
    public GiftPage setRecipientEmail(String email) {
        $("#giftModalRecipientEmail").setValue(email);
        return this;
    }

    @Step("Fill personal message")
    public GiftPage setPersonalMessage(String message) {
        $("#giftModalPersonalMessage").setValue(message);
        return this;
    }

    @Step("Click to Next")
    public GiftPage clickToGiftPersonNextButton() {
        $("#giftPersonNextButton").click();
        return this;
    }

    @Step("Click to giftRightNowButton")
    public GiftPaymentPage clickGiftRightNowButton() {
        $("#giftRightNowButton span").click();
        return new GiftPaymentPage();
    }

    @Step("Move mouse and click to BUY FOR")
    public GiftPage moveAndClickBuyFor(String gender) {
        switch (gender) {
            case "male":
                $("#buyForHim").hover();
                $(byXpath("//span[text()='Buy the gift for him']")).click();
                break;
            case "female":
                $("#buyForHer").hover();
                $(byXpath("//span[text()='Buy the gift for her']")).click();
                break;
            default:
                break;
        }
        return this;
    }
}
