package com.alura.appium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.appium.java_client.MobileCommand;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class FeatureCadastro {

    @Test
    public void senha_divergente_durante_cadastro() throws MalformedURLException {
        AppiumDriverConfig driver = new AppiumDriverConfig();

        MobileElement botaoCadastro = (MobileElement) driver.driver.findElement(By.id("br.com.alura.aluraesports:id/login_botao_cadastrar_usuario"));
        botaoCadastro.click();

        assertTrue(true);
    }
}
