package me.thisisalexis.core.rest.controller.model;

import org.junit.Test;
import org.springframework.util.Assert;

public class AppStatusTest {

    @Test
    public void testAppStatusCreation() {
        AppStatus appStatus = new AppStatus();
        Assert.notNull(appStatus, "AppStatus() constructor not working");
    }

    @Test
    public void testAppStatusParametrizedCreation() {
        AppStatus appStatus = new AppStatus(true);
        Assert.isTrue(appStatus.isStatus(), "Parametrized constructor of AppStatus not working properly");
    }

    @Test
    public void testClassBuilder() {
        Assert.notNull(AppStatus.getInstance(), "AppStatus.builder() not working properly");
    }

}
