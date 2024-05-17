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
        busqueda2.click();
    }

    public void ingresarBusqueda(String busqueda){
        ingresarBusqueda.sendKeys(busqueda);
    }

    public void primeraOpcion(){
        primeraOpcion.click();
    }

    public void siguiente() {
        siguiente.click();
    }

    public void busca() {
        btnBusca.click();
    }

    public void validoTexto(String texto) {
        texto.equals(txtCntAlojamientos.getText());
    }
}
