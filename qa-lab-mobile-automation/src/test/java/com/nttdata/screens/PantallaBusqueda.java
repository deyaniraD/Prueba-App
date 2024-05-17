package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class PantallaBusqueda extends PageObject {
    @AndroidFindBy(id="com.airbnb.android:id/search_component_1")
    private WebElement busqueda1;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Buscar destinos']")
    private WebElement busqueda2;

    @AndroidFindBy(id = "com.airbnb.android:id/input_bar_input")
    private WebElement ingresarBusqueda;

    @AndroidFindBy(id = "com.airbnb.android:id/title")
    private WebElement primeraOpcion;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Siguiente']")
    private WebElement siguiente;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Busca']")
    private WebElement btnBusca;

    @AndroidFindBy(id = "com.airbnb.android:id/n2_bottom_sheet_title_title")
    private WebElement txtCntAlojamientos;

    public void clickBusqueda1(){
        busqueda1.click();
    }

    public void clickBusqueda2(){
        tiempo(3000);
        busqueda2.click();
    }

    public void ingresarBusqueda(String busqueda){
        tiempo(3000);
        ingresarBusqueda.sendKeys(busqueda);
    }

    public void primeraOpcion(){
        tiempo(3000);
        primeraOpcion.click();
    }

    public void siguiente() {
        tiempo(3000);
        siguiente.click();
    }

    public void busca() {
        tiempo(3000);
        btnBusca.click();
    }

    public void validoTexto(String texto) {
        tiempo(6000);
        texto.equals(txtCntAlojamientos.getText());
    }

    public void tiempo(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
