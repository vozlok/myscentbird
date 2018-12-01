package com.myscentbird;

import com.myscentbird.utils.CustomExternalResource;
import com.myscentbird.utils.CustomWatcher;
import org.junit.ClassRule;
import org.junit.Rule;

public class TestBase {

    @Rule
    public CustomWatcher customWatcher = new CustomWatcher();

    @ClassRule
    public static CustomExternalResource customExternalResource = new CustomExternalResource();
}
