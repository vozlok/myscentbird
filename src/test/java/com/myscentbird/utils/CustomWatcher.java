package com.myscentbird.utils;

import com.codeborne.selenide.Screenshots;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static com.codeborne.selenide.Selenide.close;
import static com.myscentbird.utils.BrowserFactory.setBrowser;
import static com.myscentbird.utils.PropertiesReader.getProperty;

public class CustomWatcher extends TestWatcher {

    @Override
    protected void starting(Description test) {
            Screenshots.startContext(test.getClassName(), test.getMethodName());
            setBrowser(getProperty("browser"));
    }

    @Override
    protected void succeeded(Description description) {
        AllureReportUtil.attachScreenshot();
        close();
    }

    @Override
    protected void failed(Throwable e, Description description) {
        AllureReportUtil.attachScreenshot();
        close();
    }
}
