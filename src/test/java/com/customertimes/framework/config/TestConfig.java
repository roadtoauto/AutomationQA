package com.customertimes.framework.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources("classpath:test.properties")
public interface TestConfig extends Config {

    TestConfig CONFIG = ConfigFactory.create(TestConfig.class);

    String browser();
    String mail();
    String password();

    @Key("remote")
    Boolean remote();

    @Key("selenium.server.url")
    String seleniumServerUrl();

    @DefaultValue("https://21vek.by")
    String baseUrl();
}