package com.myscentbird.utils;

import com.codeborne.selenide.Configuration;

public class BrowserFactory {

    public static void setBrowser(String browser) {
        Configuration.browser = browser;
        Configuration.startMaximized=true;
    }
}
