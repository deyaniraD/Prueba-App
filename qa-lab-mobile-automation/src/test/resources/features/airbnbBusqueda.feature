Feature: Airbnb

  @busqueda
  Scenario Outline: : Busqueda de hospedaje
    Given me muestra el PopUp login lo cierro
    When doy clic en busqueda
    And ingreso el destino "<hotel>"
    And clic en la primera opcion
    And clic en el boton siguiente
    And clic en el boton busca
    Then valido que me muestre el texto "<texto>"
    Examples:
      | hotel                 | texto                    |
      | Hoteles en Cusco Perú | Más de 1000 alojamientos |