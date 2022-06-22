Feature: Prueba de distintos ingresos a la aplicación Clockify
  Como usuario de android cuyo dispositivo es Pixel4
  Quiero acceder a mi cuenta de Clockify
  Para poder interactuar con la aplicación con mi cuenta
  @test_mobile
  Scenario Outline: prueba login exitoso
    Given Tener instalado la aplicación en el dispositivo
    #Given Abrir la aplicación en el dispositivo
    When El usuario ingrese con sus credenciales: '<email>', '<password>'
    Then Se muestra el dashboard correspondiente a la cuenta

    Examples:
      | email               | password   |
      | mp.robots@gmail.com | crowdarqa5 |

