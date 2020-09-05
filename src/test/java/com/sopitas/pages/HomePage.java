package com.sopitas.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    WebElement logoSopitas;
    WebElement campoBusqueda;
    WebElement botonBusqueda;
    WebElement listaTrendingTopics;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarPagina(String url) {}
    public void verificarCargaPagina() {}
    public void verificarTrendingTopics() {}
}
