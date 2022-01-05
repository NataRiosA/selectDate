@test
Feature: Seleccion de fecha

  Quiero seleccionar una fecha en el calendario

  @Scenario
  Scenario: se debe poder seleccionar una fecha del calendario
    Given el usuario selecciona un mes y dia del anio por defecto
    When  el usuario selecciona un mes y dia aleatorio
    Then el sisteme deberia mostrar el calendario correctamente