Feature: Prueba de distintos ingresos a la aplicación Clockify

  @test_login_success
  Scenario Outline: prueba login exitoso
    Given Tener instalado la aplicación en el dispositivo
    When El usuario ingresa con correo registrado '<email>'
    And El usuario ingresa la clave asociada a la cuenta '<password>'
    And El usuario hace click en el boto de 'login'
    Then Se visualiza el menu 'Open navigation drawer'

    Examples:
      | email               | password   |
      | mp.robots@gmail.com | crowdarqa5 |

