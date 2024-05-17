package com.nttdata.steps;

import com.nttdata.screens.Login;
import com.nttdata.screens.PantallaBusqueda;
import net.thucydides.core.annotations.Step;

public class AirbnbBusquedaStep {

    Login login;
    PantallaBusqueda busqueda;

    @Step("Click en cerra")
    public void cerrarLogin() {
        login.clickClose();
    }

    @Step("Click en Busqueda")
    public void clicBusqueda() {
        busqueda.clickBusqueda1();
        busqueda.clickBusqueda2();
    }
    @Step("Ingresa Busqueda")
    public void ingresoElDestino(String destino) {
        busqueda.ingresarBusqueda(destino);
    }

    @Step("clic En La Primera Opcion")
    public void clicEnLaPrimeraOpcion() {
        busqueda.primeraOpcion();
    }

    @Step("clic En El Boton Siguiente")
    public void clicEnElBotonSiguiente() {
        busqueda.siguiente();
    }

    @Step("clic En El Boton Busca")
    public void clicEnElBotonBusca() {
        busqueda.busca();

    }

    @Step("valido texto")
    public void validotexto(String texto) {
        busqueda.validoTexto(texto);
    }
}
