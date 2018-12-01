package com.myscentbird.utils;

import com.codeborne.selenide.Configuration;
import org.junit.rules.ExternalResource;

import static com.myscentbird.utils.Constants.TIMEOUT_SELENIDE;
import static com.myscentbird.utils.PropertiesReader.getProperty;
import static com.myscentbird.utils.PropertiesReader.readPropertiesFile;

public class CustomExternalResource extends ExternalResource {

    @Override
    protected void before() throws Throwable {
        readPropertiesFile();
        Configuration.baseUrl = "https://" + getProperty("baseUrl");
        Configuration.timeout = TIMEOUT_SELENIDE;
    }

}
