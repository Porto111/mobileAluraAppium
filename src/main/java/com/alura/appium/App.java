package com.alura.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobilePlatform;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class App {

    public static void main(String[] args) throws MalformedURLException {

        File apk = new File("C:\\Users\\Guilherme\\Desktop\\Projetos QA\\mobileAluraAppium\\src\\main\\resources\\alura_esporte.apk");
        DesiredCapabilities configuracoes = new DesiredCapabilities();
        configuracoes.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
        configuracoes.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        configuracoes.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");

        URL urlConexao = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver driver = new AppiumDriver(urlConexao, configuracoes);
    }
}
