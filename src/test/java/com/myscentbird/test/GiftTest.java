package com.myscentbird.test;

import com.myscentbird.TestBase;
import com.myscentbird.common.SubscriptionInfo;
import com.myscentbird.pages.GiftPage;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class GiftTest extends TestBase {

    @DataProvider
    public static Object[][] dataProviderGenderSizePrice() {
        return new Object[][]{
                {"male", 3, "$44.00"},
                {"female", 6, "$84.00"},
                {"male", 12, "$164.00"},
        };
    }

    @DisplayName("Check subscription price and gift color")
    @UseDataProvider("dataProviderGenderSizePrice")
    @Test
    public void CheckGiftSubscriptionTest(String gender, int sizeOfGift, String price){
        SubscriptionInfo sub = new SubscriptionInfo(sizeOfGift, price, gender,"Andrey Kozlov", "test@test.com", "test message");
        new GiftPage().openGiftPage().
                clickToBuyGiftNowTopBlock().
                moveAndClickBuyFor(sub.getGender()).
                clickToSizeOfGift(sub.getSizeOfGift()).
                setRecipientName(sub.getName()).
                setRecipientEmail(sub.getEmail()).
                setPersonalMessage(sub.getMessage()).
                clickToGiftPersonNextButton().
                clickGiftRightNowButton().
                checkSubscriptionPrice(sub.getPrice()).
                checkGiftColor(sub.getGender());
    }
}
