package com.alura.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverConfig {
    public final AppiumDriver driver;
    public AppiumDriverConfig () throws MalformedURLException {

        File apk = new File("C:\\Users\\Guilherme\\Desktop\\Projetos QA\\mobileAluraAppium\\src\\main\\resources\\alura_esporte.apk");
        DesiredCapabilities configuracoes = new DesiredCapabilities();
        configuracoes.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
        configuracoes.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        configuracoes.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");

        URL urlConexao = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(urlConexao, configuracoes);

    }
}
