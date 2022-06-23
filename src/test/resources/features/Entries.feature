@test_entries
Feature: Prueba de distintas entradas de tareas en la aplicación Clockify

  Background:
    Given Tener instalado la aplicación en el dispositivo
    When El usuario ingresa con correo registrado 'mp.robots@gmail.com'
    And El usuario ingresa la clave asociada a la cuenta 'crowdarqa5'
    And El usuario hace click en el boto de 'login'

  @test_add_entries_success
  Scenario Outline: prueba creación de proyecto y guardado del mismo
    And El usuario hace click en el boton de agregado de entidad
    And El usuario agrega las <horas> horas desde la vista actual
    And El usuario agrega los <minutos> minutos desde la vista actual
    And El usuario presiona el botón para guardar
    Then El usuario vuelve al dashboard visualizando la nueva entrada

    Examples:
      | horas | minutos |
      | 23    | 55      |
      | 10    | 23      |

  @test_cancel_add_entry
  Scenario Outline: prueba creación de proyecto y no guardado del mismo
    And El usuario hace click en el boton de agregado de entidad
    And El usuario agrega las <horas> horas desde la vista actual
    And El usuario agrega los <minutos> minutos desde la vista actual
    And El usuario presiona el botón para descartar los cambios
    Then El usuario presiona el botón de confirmación para descartar los cambios

    Examples:
      | horas | minutos |
      | 11    | 12      |

  @test_add_entries_with_YYYYMMDD_success @test_mobile
  Scenario Outline: prueba creación de proyecto con fecha YYYY/MM/DD
    And El usuario hace click en el boton de agregado de entidad
    And El usuario hace click en donde está la fecha abreviada
    And El usuario busca la fecha deseada <fecha> en el calendario con las flechas
    And El usuario agrega las <horas> horas desde la vista start del calendario
    And El usuario agrega los <minutos> minutos desde la vista start del calendario
    And El usuario agrega las <horas> horas desde la vista end del calendario
    And El usuario agrega los <minutos> minutos desde la vista end del calendario
    And El usuario presiona el botón para guardar
    Then El usuario vuelve al dashboard visualizando la nueva entrada

    Examples:
      | horas | minutos | fecha        |
      | 10    | 20      | 23 June 2022 |



