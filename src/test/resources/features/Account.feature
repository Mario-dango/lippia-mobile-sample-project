@test_account_options
Feature: Prueba de distintas opciones dentro de los usuarios de la aplicación Clockify

  Background:
    Given Tener instalado la aplicación en el dispositivo
    When El usuario ingresa con correo registrado 'mp.robots@gmail.com'
    And El usuario ingresa la clave asociada a la cuenta 'crowdarqa5'
    And El usuario hace click en el boto de 'login'


  @test_logout_success
  Scenario: Cierre de sesión exitoso
    And El usuario hace click en el boton del menu lateral superior izquierdo
    And El usuario verifica que el menu despliege las opciones de la cuenta
    And El usuario clickea la opción Logout del mismo menu
    And El usuario clickea la opción de confirmar el cierre de su sesión
    Then El usuario verifica que vuelve a la ventana para ingresar las credenciales de la cuenta para logearse

  @test_enable_darkMode_success
  Scenario: cambiar la visualización al modo nocturno
    And El usuario hace click en el boton del menu lateral superior izquierdo
    And El usuario verifica que el menu despliege las opciones de la cuenta
    And El usuario clickea la opción Settings del mismo menu
    And El usuario verifica que esta desactivado el modo oscuro
    And El usuario activa modo oscuro
    And El usuario hace click en el boton del menu lateral superior izquierdo
    Then El usuario vuelve al dashboard visualizando en modo oscuro


